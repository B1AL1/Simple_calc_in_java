public class Okno extends javax.swing.JFrame {

    public Okno() {
        initComponents();
    }                        
    private void initComponents() {

        buttonPlus = new javax.swing.JButton();
        buttonMinus = new javax.swing.JButton();
        buttonMultiply = new javax.swing.JButton();
        buttonDivide = new javax.swing.JButton();
        buttonC = new javax.swing.JButton();
        buttonSquare = new javax.swing.JButton();
        buttonSqrt = new javax.swing.JButton();
        text1 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        wynikNapis = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelWynik = new javax.swing.JLabel();
        decToBin = new javax.swing.JButton();
        binToDec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonPlus.setText("+");
        buttonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlusActionPerformed(evt);
            }
        });

        buttonMinus.setText("-");
        buttonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMinusActionPerformed(evt);
            }
        });

        buttonMultiply.setText("X");
        buttonMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultiplyActionPerformed(evt);
            }
        });

        buttonDivide.setText("/");
        buttonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivideActionPerformed(evt);
            }
        });

        buttonC.setText("C");
        buttonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCActionPerformed(evt);
            }
        });

        buttonSquare.setText("^2");
        buttonSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSquareActionPerformed(evt);
            }
        });

        buttonSqrt.setText("sqrt");
        buttonSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSqrtActionPerformed(evt);
            }
        });

        wynikNapis.setText("Wynik:");

        decToBin.setText("Zamiana na binarną");
        decToBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decToBinActionPerformed(evt);
            }
        });

        binToDec.setText("Zamiana na dziesiętną");
        binToDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binToDecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(text1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(text2))
                        .addGap(18, 18, 18)
                        .addComponent(wynikNapis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelWynik, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(decToBin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(binToDec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(decToBin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(binToDec)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wynikNapis)
                    .addComponent(jLabel1)
                    .addComponent(labelWynik, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>                        

    private void buttonPlusActionPerformed(java.awt.event.ActionEvent evt) {                                           
        labelWynik.setText(String.valueOf((Double.parseDouble(text1.getText()))+(Double.parseDouble(text2.getText()))));
    }                                          

    private void buttonMinusActionPerformed(java.awt.event.ActionEvent evt) {                                            
        labelWynik.setText(String.valueOf((Double.parseDouble(text1.getText()))-(Double.parseDouble(text2.getText()))));
    }                                           

    private void buttonMultiplyActionPerformed(java.awt.event.ActionEvent evt) {                                               
        labelWynik.setText(String.valueOf((Double.parseDouble(text1.getText()))*(Double.parseDouble(text2.getText()))));
    }                                              

    private void buttonDivideActionPerformed(java.awt.event.ActionEvent evt) {                                             
        try
        {
            if (Double.parseDouble(text2.getText()) == 0)
            {
                    throw new ArithmeticException();
            }
            labelWynik.setText(String.valueOf((Double.parseDouble(text1.getText()))/(Double.parseDouble(text2.getText()))));
        }
        catch(ArithmeticException e)
        {
            text1.setText("");
            text2.setText("");
            labelWynik.setText("Błąd! - dzielenie przez 0");
        }
    }                                            

    private void buttonCActionPerformed(java.awt.event.ActionEvent evt) {                                        
        text1.setText("");
        text2.setText("");
        labelWynik.setText("");
    }                                       

    private void buttonSquareActionPerformed(java.awt.event.ActionEvent evt) {                                             
        labelWynik.setText(String.valueOf(Math.pow(Double.parseDouble(text1.getText()), 2)));
    }                                            

    private void buttonSqrtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        labelWynik.setText(String.valueOf(Math.sqrt(Double.parseDouble(text1.getText()))));
    }                                          

    private void decToBinActionPerformed(java.awt.event.ActionEvent evt) {                                         
        labelWynik.setText(Integer.toBinaryString(Integer.parseInt(text1.getText())));
    }                                        

    private void binToDecActionPerformed(java.awt.event.ActionEvent evt) {                                         
        labelWynik.setText(String.valueOf(Integer.parseInt(text1.getText(),2)));
    }                                        

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton binToDec;
    private javax.swing.JButton buttonC;
    private javax.swing.JButton buttonDivide;
    private javax.swing.JButton buttonMinus;
    private javax.swing.JButton buttonMultiply;
    private javax.swing.JButton buttonPlus;
    private javax.swing.JButton buttonSqrt;
    private javax.swing.JButton buttonSquare;
    private javax.swing.JButton decToBin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelWynik;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JLabel wynikNapis;
    // End of variables declaration                   
}
