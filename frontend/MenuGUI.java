package frontend;

import javax.swing.JOptionPane;

public class MenuGUI extends javax.swing.JFrame {
    //global variables ABC
    //number of pieces
    public int noA;
    public int noB;
    public int noC;
    //value of pieces
    public double valA;
    public double valB;
    public double valC;
    //global variables LPT
    //number of pieces
    public int noL;
    public int noP;
    public int noT;
    //value of pieces
    public double valL;
    public double valP;
    public double valT;
    
    //gui
    public MenuGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    
    private void initComponents() {
        //component initialization
        textArea1 = new java.awt.TextArea();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        solveB1 = new javax.swing.JButton();
        solveB2 = new javax.swing.JButton();
        solveB2_Exact = new javax.swing.JButton();
        exitB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ANoTF = new javax.swing.JTextField();
        BNoTF = new javax.swing.JTextField();
        CNoTF = new javax.swing.JTextField();
        AValTF = new javax.swing.JTextField();
        BValTF = new javax.swing.JTextField();
        CValTF = new javax.swing.JTextField();
        LNoTF = new javax.swing.JTextField();
        PNoTF = new javax.swing.JTextField();
        TNoTF = new javax.swing.JTextField();
        LValTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PValTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TValTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        //component values
        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cargo Tool");
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cargo-Space Optimizer");

        solveB1.setBackground(new java.awt.Color(255, 102, 0));
        solveB1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        solveB1.setForeground(new java.awt.Color(51, 51, 51));
        solveB1.setText("Attemp to fill cargo with A, B, C parcels ");
        solveB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 153), 4));
        solveB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveB1ActionPerformed(evt);
            }
        });

        solveB2.setBackground(new java.awt.Color(255, 102, 0));
        solveB2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        solveB2.setForeground(new java.awt.Color(51, 51, 51));
        solveB2.setText("Attemp to fill cargo with L, P, T parcels ");
        solveB2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 153), 4));
        solveB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveB2ActionPerformed(evt);
            }
        });

        solveB2_Exact.setBackground(new java.awt.Color(255, 102, 0));
        solveB2_Exact.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        solveB2_Exact.setForeground(new java.awt.Color(51, 51, 51));
        solveB2_Exact.setText("Exact fill cargo with L, P, T parcels ");
        solveB2_Exact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 153), 4));
        solveB2_Exact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveB2_ExactActionPerformed(evt);
            }
        });

        exitB.setBackground(new java.awt.Color(255, 102, 0));
        exitB.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        exitB.setForeground(new java.awt.Color(51, 51, 51));
        exitB.setText("EXIT :(");
        exitB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 153), 4));
        exitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("No.");

        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Value");

        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("A");

        jLabel5.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("B");

        jLabel6.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("C");

        ANoTF.setBackground(new java.awt.Color(51, 51, 51));
        ANoTF.setForeground(new java.awt.Color(204, 204, 204));
        ANoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ANoTF.setText("0");
        ANoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));

        BNoTF.setBackground(new java.awt.Color(51, 51, 51));
        BNoTF.setForeground(new java.awt.Color(204, 204, 204));
        BNoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BNoTF.setText("0");
        BNoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));

        CNoTF.setBackground(new java.awt.Color(51, 51, 51));
        CNoTF.setForeground(new java.awt.Color(204, 204, 204));
        CNoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CNoTF.setText("0");
        CNoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));

        AValTF.setBackground(new java.awt.Color(51, 51, 51));
        AValTF.setForeground(new java.awt.Color(204, 204, 204));
        AValTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AValTF.setText("1");
        AValTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));

        BValTF.setBackground(new java.awt.Color(51, 51, 51));
        BValTF.setForeground(new java.awt.Color(204, 204, 204));
        BValTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BValTF.setText("1");
        BValTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));

        CValTF.setBackground(new java.awt.Color(51, 51, 51));
        CValTF.setForeground(new java.awt.Color(204, 204, 204));
        CValTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CValTF.setText("1");
        CValTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));

        LNoTF.setBackground(new java.awt.Color(51, 51, 51));
        LNoTF.setForeground(new java.awt.Color(204, 204, 204));
        LNoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LNoTF.setText("0");
        LNoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));

        PNoTF.setBackground(new java.awt.Color(51, 51, 51));
        PNoTF.setForeground(new java.awt.Color(204, 204, 204));
        PNoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PNoTF.setText("0");
        PNoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));

        TNoTF.setBackground(new java.awt.Color(51, 51, 51));
        TNoTF.setForeground(new java.awt.Color(204, 204, 204));
        TNoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TNoTF.setText("0");
        TNoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));

        LValTF.setBackground(new java.awt.Color(51, 51, 51));
        LValTF.setForeground(new java.awt.Color(204, 204, 204));
        LValTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LValTF.setText("1");
        LValTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));

        jLabel7.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("No.");

        PValTF.setBackground(new java.awt.Color(51, 51, 51));
        PValTF.setForeground(new java.awt.Color(204, 204, 204));
        PValTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PValTF.setText("1");
        PValTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));

        jLabel8.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Value");

        TValTF.setBackground(new java.awt.Color(51, 51, 51));
        TValTF.setForeground(new java.awt.Color(204, 204, 204));
        TValTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TValTF.setText("1");
        TValTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));

        jLabel9.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("L");

        jLabel10.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("P");

        jLabel11.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("T");

        //component layout
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(solveB2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(solveB2_Exact, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(solveB1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9))
                            .addComponent(jLabel11))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LNoTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PNoTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TNoTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(LValTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PValTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TValTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addComponent(jLabel6))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ANoTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BNoTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CNoTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(AValTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BValTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CValTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ANoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AValTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(BNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BValTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CValTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(solveB1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(LNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LValTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(PNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PValTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TValTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(solveB2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(solveB2_Exact, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //solve ABC button pressed action listener
    private void solveB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveB1ActionPerformed
        boolean valid =setValuesABC();
        if (valid){
            JOptionPane.showMessageDialog(null, "Processing may take up to 30sec - be patient!\nYou can rotoate the space using the arrow keys, mouse and R key - and use x/z keys to zoom!");
            new SolveF1(noC,noB,noA,valC,valB,valA).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_solveB1ActionPerformed

    //solve LPT button pressed action listener
    private void solveB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveB2ActionPerformed
        boolean valid =setValuesLPT();
        if (valid){
            JOptionPane.showMessageDialog(null, "Processing may take up to 30sec - be patient!\nYou can rotoate the space using the arrow keys, mouse and R key - and use x/z keys to zoom!");
            new SolveF2(noT,noP,noL,valT,valP,valL).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_solveB2ActionPerformed

    //solve LPT exact button pressed action listener
    private void solveB2_ExactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveB2ActionPerformed
        boolean valid =true;///////////////setValuesLPT();      
        if (valid){
            JOptionPane.showMessageDialog(null, "Processing may take up to 30sec - be patient!\nYou can rotoate the space using the arrow keys, mouse and R key - and use x/z keys to zoom!");
            new SolveF2_Exact().setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_solveB2ActionPerformed

    //exit button pressed action listener
    private void exitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBActionPerformed
    
    //basic input check ABC
    private boolean setValuesABC(){
        try{
            noA =Integer.parseInt(ANoTF.getText());
            noB =Integer.parseInt(BNoTF.getText());
            noC =Integer.parseInt(CNoTF.getText());
            valA =Double.parseDouble(AValTF.getText());
            valB =Double.parseDouble(BValTF.getText());
            valC =Double.parseDouble(CValTF.getText());
            if (valA <=0 || valB <=0 || valC <= 0 || noA < 0 || noB < 0 || noC < 0){
                throw new NumberFormatException();
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter valid numbers", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    //basic input check LPT
    private boolean setValuesLPT(){//basic input check
        try{
            noL =Integer.parseInt(LNoTF.getText());
            noP =Integer.parseInt(PNoTF.getText());
            noT =Integer.parseInt(TNoTF.getText());
            valL =Double.parseDouble(LValTF.getText());
            valP =Double.parseDouble(PValTF.getText());
            valT =Double.parseDouble(TValTF.getText());
            if (valL <=0 || valP <=0 || valT <=0 || noL <0 || noP <0 || noT <0){
                throw new NumberFormatException();
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter valid numbers", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    //////////////////////MAIN
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ANoTF;
    private javax.swing.JTextField AValTF;
    private javax.swing.JTextField BNoTF;
    private javax.swing.JTextField BValTF;
    private javax.swing.JTextField CNoTF;
    private javax.swing.JTextField CValTF;
    private javax.swing.JTextField LNoTF;
    private javax.swing.JTextField LValTF;
    private javax.swing.JTextField PNoTF;
    private javax.swing.JTextField PValTF;
    private javax.swing.JTextField TNoTF;
    private javax.swing.JTextField TValTF;
    private javax.swing.JButton exitB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton solveB1;
    private javax.swing.JButton solveB2;
    private javax.swing.JButton solveB2_Exact;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
