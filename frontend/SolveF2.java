package frontend;

import backend.*;

import javax.swing.JPanel;

import backend.*;

import java.awt.Dimension;
import java.util.LinkedList;

public class SolveF2 extends SolveF2_Exact {

    // Displays Best Cover for parcels L,P,T with custom prices and custom amounts 
    public SolveF2(int t, int p, int l, double t_price, double p_price, double l_price) {
        super(true);
        
        initComponents();
        intFrame3D.requestFocus();
        CargoXBest local_solver  = new CargoXBest(5,8,33,PentominoDatabase.database);
        local_solver.setTimeLimit(30);
        solution_stack = local_solver.solvePacking(new int[]{t,p,l},new double[]{t_price,p_price,l_price});
        stack_size = solution_stack.size();
        intFrame3D.displaySolution(solution_stack);
    }

}
