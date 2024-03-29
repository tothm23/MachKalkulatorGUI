/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package machkalkulatorgui;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Tóth Milán
 */
public class MachKalkulatorGUI extends javax.swing.JFrame {

    /**
     * Creates new form MachKalkulatorGUI
     */
    public MachKalkulatorGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        torlonyomasBe = new javax.swing.JTextField();
        statikusNyomasBe = new javax.swing.JTextField();
        szamol = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eredemnyekKi = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mach-szám kalkulátor");
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(372, 479));
        setMinimumSize(new java.awt.Dimension(372, 479));
        setModalExclusionType(null);
        setPreferredSize(new java.awt.Dimension(372, 479));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Torlónyomás:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 103, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Eredmények:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        torlonyomasBe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        torlonyomasBe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torlonyomasBeActionPerformed(evt);
            }
        });
        getContentPane().add(torlonyomasBe, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 130, -1));

        statikusNyomasBe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statikusNyomasBe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statikusNyomasBeActionPerformed(evt);
            }
        });
        getContentPane().add(statikusNyomasBe, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 130, -1));

        szamol.setText("Számol");
        szamol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szamolas(evt);
            }
        });
        getContentPane().add(szamol, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, 70));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Statikus nyomás:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        eredemnyekKi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(eredemnyekKi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 335, 266));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void torlonyomasBeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torlonyomasBeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_torlonyomasBeActionPerformed

    private void statikusNyomasBeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statikusNyomasBeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statikusNyomasBeActionPerformed

    private void szamolas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szamolas
        DefaultListModel<String> model = new DefaultListModel<>();

        try {
            // A valós számokat megadhatjuk .-tal vagy ,-vel elválasztva
            double qc = torlonyomasBe.getText().contains(",") ? Double.parseDouble(torlonyomasBe.getText().replace(",", ".")) : Double.parseDouble(torlonyomasBe.getText());
            double p0 = statikusNyomasBe.getText().contains(",") ? Double.parseDouble(statikusNyomasBe.getText().replace(",", ".")) : Double.parseDouble(statikusNyomasBe.getText());

            double Ma = Math.sqrt(5 * (Math.pow((qc / p0) + 1, (double) 2 / 7) - 1));
            model.addElement("qc=" + qc + " p0=" + p0 + " Ma=" + Ma);
            eredemnyekKi.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "nem megfelelő a beviteli karakterlánc formátuma.", "", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_szamolas

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MachKalkulatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MachKalkulatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MachKalkulatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MachKalkulatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MachKalkulatorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> eredemnyekKi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField statikusNyomasBe;
    private javax.swing.JButton szamol;
    private javax.swing.JTextField torlonyomasBe;
    // End of variables declaration//GEN-END:variables
}
