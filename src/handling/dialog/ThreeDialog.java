/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//Nama  : Tri Ilman Almunawarah Fattah
//NIM   : 32602000101
package handling.dialog;

import javax.swing.JOptionPane;


public class ThreeDialog extends javax.swing.JFrame {

    /**
     * Creates new form ThreeDialog
     */
    public ThreeDialog() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BMessage = new javax.swing.JButton();
        BConfirm = new javax.swing.JButton();
        BInput = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Box Dialog - Tri Ilman Almunawarah Fattah");

        BMessage.setText("Message");
        BMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMessageActionPerformed(evt);
            }
        });

        BConfirm.setText("Confirm");
        BConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BConfirmActionPerformed(evt);
            }
        });

        BInput.setText("Input");
        BInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInputActionPerformed(evt);
            }
        });

        jTextField1.setText("Your Action Here!!");

        jButton1.setText("!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(BConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 98, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(35, 35, 35)
                .addComponent(BMessage)
                .addGap(18, 18, 18)
                .addComponent(BConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMessageActionPerformed
        // TODO add your handling code here:
    JOptionPane.showMessageDialog(this, "Klik OK Button", "Message Dialog", JOptionPane.INFORMATION_MESSAGE);
    
    jTextField1.setText("Anda memilih Message Dialog");
    }//GEN-LAST:event_BMessageActionPerformed

    private void BInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInputActionPerformed
        // TODO add your handling code here:
    String nilai = JOptionPane.showInputDialog(this, "Masukkan bilangan: ");
    
    int modul = Integer.parseInt(nilai);
    if (modul % 2 != 0){
        JOptionPane.showMessageDialog(this, modul + " Bilangan Ganjil");
        jTextField1.setText(modul + " Bilangan Ganjil");
    }else{
        JOptionPane.showMessageDialog(this, modul + " Bilangan Genap");
        jTextField1.setText(modul + " Bilangan Genap");
    }
    
    }//GEN-LAST:event_BInputActionPerformed

    private void BConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BConfirmActionPerformed
        // TODO add your handling code here:
    int confirm = JOptionPane.showConfirmDialog(this, "Tekan YES, NO, atau CANCEL button","Confirm Box Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
    
        if(confirm == 0){
            jTextField1.setText("Anda Merespon YES");
        }else if(confirm == 1){
            jTextField1.setText("Anda Merespon NO");
        }else{
            jTextField1.setText("Anda Merespon CANCEL");
        }
    }//GEN-LAST:event_BConfirmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String ket = "Aplikasi ini dibuat oleh Tri Ilman Almunawarah Fattah - 32602000101\nAplikasi ini dibuat tanpa look and feel\n";
        JOptionPane.showMessageDialog(null, ket, "Info", HEIGHT);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThreeDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BConfirm;
    private javax.swing.JButton BInput;
    private javax.swing.JButton BMessage;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
