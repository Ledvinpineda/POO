/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author perez
 */
public class Animales extends javax.swing.JFrame {
    
    
    public Animales(){
         initComponents();
    }


private void initComponents(){

    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    jTextField1 = new java.swing.JTextField();
    
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    
    JLabel1.setText("Pelo");
    
    jTextField.setText("jTextField1");
    
    javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Aligment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
         .addGap(31, 31, 31)
         .addComponent(jLabel1)
         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
         .addComponent(jTextFiel1, java.swing.GroupLayout.PREFERRED_SIZE, 133)
         .addContainerGap(201, Short.MAX_VALUE)   
    );
    
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Aligment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
          .addGap(13, 13, 13)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Aligment.Baseline)
            .addComponent(jLabel1)
            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,javax.swingGroupLayout.PREFERRED_SIZE))
          .addContainerGap(265, Short.MAX_VALUE))     
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
    
        
}





}
