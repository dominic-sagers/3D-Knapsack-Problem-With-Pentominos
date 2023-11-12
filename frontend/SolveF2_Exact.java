package frontend;

//imports
import backend.*;
import javax.swing.JPanel;
import backend.PentominoDatabase;
import java.awt.Dimension;
import java.util.LinkedList;

// TODO: adjust sizes of cerating buttons; add controls description

public class SolveF2_Exact extends javax.swing.JFrame {
    //fetch backend
    public SolveF2_Exact() {
        initComponents();
        intFrame3D.requestFocus();
        solver  = new CargoX(33,8,5,PentominoDatabase.database);
        solution_stack = solver.solvePacking();
        stack_size = solution_stack.size();
        intFrame3D.displaySolution(solution_stack);
        pieceTF.setText(String.valueOf(solution_stack.size()));
    }
    public SolveF2_Exact(boolean pass){
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    protected void initComponents() {
        //component initilization
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        intFrame3D = new Panel3D(33,8,5,25,new Dimension(700,700));
        backB = new javax.swing.JButton();
        hideTranslucent = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pieceTF = new javax.swing.JTextField();
        nextPieceB = new javax.swing.JButton();
        prevPieceB = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        //component details
        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("3D MODEL");

        intFrame3D.setBackground(new java.awt.Color(51, 51, 51));
        intFrame3D.setVisible(true);

        backB.setBackground(new java.awt.Color(0, 0, 0));
        backB.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        backB.setForeground(new java.awt.Color(255, 0, 153));
        backB.setText("←");
        backB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 3));
        backB.setPreferredSize(new java.awt.Dimension(300, 40));
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        hideTranslucent.setBackground(new java.awt.Color(0, 0, 0));
        hideTranslucent.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        hideTranslucent.setForeground(new java.awt.Color(255, 0, 153));
        hideTranslucent.setText("Hide Grid");
        hideTranslucent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 3));
        hideTranslucent.setPreferredSize(new java.awt.Dimension(300, 40));
        hideTranslucent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hideActionPerformed(evt);
            }
        });



        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("KEY:   L = BLUE    P = GREEN   T = RED");

        jLabel5.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PIECE");

        pieceTF.setEditable(false);
        pieceTF.setBackground(new java.awt.Color(255, 153, 51));
        pieceTF.setFont(new java.awt.Font("Agency FB", 3, 24)); // NOI18N
        pieceTF.setForeground(new java.awt.Color(0, 0, 0));
        pieceTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pieceTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102), 4));
        pieceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieceTFActionPerformed(evt);
            }
        });

        nextPieceB.setBackground(new java.awt.Color(0, 0, 0));
        nextPieceB.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nextPieceB.setForeground(new java.awt.Color(255, 0, 153));
        nextPieceB.setText("►");
        nextPieceB.setPreferredSize(new java.awt.Dimension(120, 40));
        nextPieceB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPieceBActionPerformed(evt);
            }
        });

        prevPieceB.setBackground(new java.awt.Color(0, 0, 0));
        prevPieceB.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        prevPieceB.setForeground(new java.awt.Color(255, 0, 153));
        prevPieceB.setText("◄");
        prevPieceB.setPreferredSize(new java.awt.Dimension(120, 40));
        prevPieceB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevPieceBActionPerformed(evt);
            }
        });

        //component layout
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backB, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(hideTranslucent, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(intFrame3D))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(prevPieceB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextPieceB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pieceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hideTranslucent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(intFrame3D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pieceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nextPieceB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prevPieceB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //back to menu button pressed action listener
    protected void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        new MenuGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBActionPerformed

    //hide grid button pressed action listener
    protected void hideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        intFrame3D.displayTraslucent();
        intFrame3D.requestFocus();
    }//GEN-LAST:event_backBActionPerformed

    //piece counter
    protected void pieceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieceTFActionPerformed
        intFrame3D.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_pieceTFActionPerformed

    //next piece button pressed action listener
    protected void nextPieceBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPieceBActionPerformed
        if(stack_size == solution_stack.size()){
            stack_size = 0; 
            intFrame3D.displaySolution(solution_stack,0);
            pieceTF.setText("0"); 
            return;
        }
        ++stack_size;
       intFrame3D.displaySolution(solution_stack,stack_size);
        intFrame3D.requestFocus();
        pieceTF.setText(String.valueOf(stack_size));
    }//GEN-LAST:event_nextPieceBActionPerformed

    //previous piece button pressed action listener
    protected void prevPieceBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevPieceBActionPerformed
       if(stack_size == 0){stack_size = solution_stack.size(); 
        intFrame3D.displaySolution(solution_stack); 
        pieceTF.setText(String.valueOf(stack_size));
        return;
    }
        --stack_size;
        intFrame3D.displaySolution(solution_stack,stack_size);
        intFrame3D.requestFocus();
        pieceTF.setText(String.valueOf(stack_size));
    }//GEN-LAST:event_prevPieceBActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton backB;
    protected javax.swing.JButton hideTranslucent;
    protected Panel3D intFrame3D;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabel5;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JButton nextPieceB;
    protected javax.swing.JTextField pieceTF;
    protected javax.swing.JButton prevPieceB;

    protected int stack_size;
    protected LinkedList<N.RNode> solution_stack;
    protected CargoX solver;
}
