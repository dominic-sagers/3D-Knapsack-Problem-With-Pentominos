package frontend;

import java.util.LinkedList;
import backend.*;
import java.awt.Dimension;

public class SolveF1 extends SolveF2_Exact {


    // Displays Best Cover for Parcels A,B,C with custom prices and custom amounts
   public SolveF1(int c, int b, int a, double c_price, double b_price, double a_price){
    super(true);
        
    initComponents();
    intFrame3D.requestFocus();
    CargoXBest local_solver  = new CargoXBest(33,8,5,ParcelDatabase.database);
    local_solver.setTimeLimit(30);
    solution_stack = local_solver.solvePacking(new int[]{c,b,a},new double[]{c_price,b_price,a_price});
    stack_size = solution_stack.size();
    intFrame3D.displaySolution(solution_stack);
   }
}
