// File: MyFan.java
// Author: ATG8
// Date: 21-2-2016
// Purpose: This program is designed to simulate the operation of a household fan.

package myfan;

public final class MyFan extends javax.swing.JFrame{

  // Variable declaration                   
  private javax.swing.JButton exitProgram;
  private javax.swing.JButton fanHigh;
  private javax.swing.JLabel fanImage;
  private javax.swing.JButton fanLow;
  private javax.swing.JButton fanMed;
  private javax.swing.JButton fanOff;
  private javax.swing.JPanel fanPanel;
  private javax.swing.JLabel userMessage;           

  public MyFan(){
    initComponents();
  } // creates new instance

  public void initComponents(){
    
    fanPanel = new javax.swing.JPanel();
    fanOff = new javax.swing.JButton();
    fanLow = new javax.swing.JButton();
    fanMed = new javax.swing.JButton();
    fanHigh = new javax.swing.JButton();
    exitProgram = new javax.swing.JButton();
    userMessage = new javax.swing.JLabel();
    fanImage = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setSize(410, 360);

    // setup jPanel and default layout
    fanPanel.setBackground(new java.awt.Color(255, 153, 51));
    fanPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Week 6 Discussion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 1, 14)));
    fanPanel.setToolTipText("Click buttons to simulate turning fan Off, Low, Med, or High.");
    fanPanel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));

    fanOff.setBackground(new java.awt.Color(51, 255, 0));
    fanOff.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
    fanOff.setText("Off");
    fanOff.addActionListener((java.awt.event.ActionEvent evt) -> {
        fanOffActionPerformed(evt);
    });

    fanLow.setBackground(new java.awt.Color(51, 255, 0));
    fanLow.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
    fanLow.setText("Low");
    fanLow.addActionListener((java.awt.event.ActionEvent evt) -> {
        fanLowActionPerformed(evt);
    });

    fanMed.setBackground(new java.awt.Color(51, 255, 0));
    fanMed.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
    fanMed.setText("Med");
    fanMed.addActionListener((java.awt.event.ActionEvent evt) -> {
        fanMedActionPerformed(evt);
    });

    fanHigh.setBackground(new java.awt.Color(51, 255, 0));
    fanHigh.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
    fanHigh.setText("High");
    fanHigh.addActionListener((java.awt.event.ActionEvent evt) -> {
        fanHighActionPerformed(evt);
    });

    exitProgram.setBackground(new java.awt.Color(51, 255, 0));
    exitProgram.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
    exitProgram.setText("Click Me to Exit");
    exitProgram.addActionListener((java.awt.event.ActionEvent evt) -> {
        exitProgramActionPerformed(evt);
    });

    userMessage.setBackground(new java.awt.Color(0, 153, 102));
    userMessage.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
    userMessage.setText("Click on Buttons Below to Operate Fan");


    fanImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    fanImage.setIcon(new javax.swing.ImageIcon("fanOff.GIF"));
    fanImage.setText("jLabel1");
    fanImage.setMaximumSize(new java.awt.Dimension(185, 185));
    fanImage.setMinimumSize(new java.awt.Dimension(185, 185));
    fanImage.setPreferredSize(new java.awt.Dimension(185, 185));

    javax.swing.GroupLayout fanPanelLayout = new javax.swing.GroupLayout(fanPanel);
    fanPanel.setLayout(fanPanelLayout);
    fanPanelLayout.setHorizontalGroup(
        fanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(fanPanelLayout.createSequentialGroup()
            .addGroup(fanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fanPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fanOff, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(fanLow, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(fanMed, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(fanHigh, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addGroup(fanPanelLayout.createSequentialGroup()
                    .addGroup(fanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fanPanelLayout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(userMessage))
                        .addGroup(fanPanelLayout.createSequentialGroup()
                            .addGap(126, 126, 126)
                            .addComponent(exitProgram)))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
        .addGroup(fanPanelLayout.createSequentialGroup()
            .addGap(105, 105, 105)
            .addComponent(fanImage, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    fanPanelLayout.setVerticalGroup(
        fanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fanPanelLayout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(fanImage, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(userMessage)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(fanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(fanOff)
                .addComponent(fanLow)
                .addComponent(fanMed)
                .addComponent(fanHigh))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(exitProgram)
            .addGap(6, 6, 6))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(fanPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(fanPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

  } // end initComponenets setup for jPanel

  // set fanStates
  // set exit button
  private void exitProgramActionPerformed(java.awt.event.ActionEvent evt) {                                            
    // clicking "Click Me to Exit" exits the program
    System.exit(0);
  }                                           

  // set fanOff
  private void fanOffActionPerformed(java.awt.event.ActionEvent evt) {                                       
    // clicking "Off" will change fan image to off
    fanImage.setIcon(new javax.swing.ImageIcon("fanOff.GIF"));
  }                                      

  // set fanLow
  private void fanLowActionPerformed(java.awt.event.ActionEvent evt) {                                       
    // clicking "Low" will change fan image to low
    fanImage.setIcon(new javax.swing.ImageIcon("fanLow.GIF"));
  }                                      

  // set fanMed
  private void fanMedActionPerformed(java.awt.event.ActionEvent evt) {                                       
    // clicking "Med" will change fan image to medium
    fanImage.setIcon(new javax.swing.ImageIcon("fanMed.GIF"));
  }                                      

  // set fanHigh
  private void fanHighActionPerformed(java.awt.event.ActionEvent evt) {                                        
    // clicking "High" will change fan image to high
    fanImage.setIcon(new javax.swing.ImageIcon("fanHigh.GIF"));
  }                                       


  // main, create and display form
  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> {
        new MyFan().setVisible(true);
    } // end run
    ); // end event queue
  } // end main
} // end program