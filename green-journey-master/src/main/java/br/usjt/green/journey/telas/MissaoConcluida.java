/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.usjt.green.journey.telas;

/**
 *
 * @author Osmar Jatoba Neto
 */
public class MissaoConcluida extends javax.swing.JFrame {

    /**
     * Creates new form MissaoConcluida
     */
    public MissaoConcluida() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Osmar Jatoba Neto\\Desktop\\foia canto inferior direito.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(509, 329, 90, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Osmar Jatoba Neto\\Desktop\\foia canto superior direito.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(521, 0, 90, 90);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Osmar Jatoba Neto\\Desktop\\foia canto superior esquerdo.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 90, 90);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Osmar Jatoba Neto\\Desktop\\foia_canto_inferior_esquerdo.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 329, 90, 90);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(530, 248, 0, 0);

        jTextField1.setBackground(new java.awt.Color(0, 102, 51));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("   Parabéns, mais uma missão concluída!");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(114, 116, 371, 33);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(491, 254, 0, 165);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("As pequenas ações ajudam a mudar o mundo. \nCuide e proteja o nosso meio ambiente! \nContamos com você para evoluirmos e transformar \no mundo em um lugar melhor! ");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(114, 167, 371, 126);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Osmar Jatoba Neto\\Desktop\\green_journey_logo grande - menor.png")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(193, 18, 212, 86);

        jButton1.setText("Pegar Recompensa ☆");
        getContentPane().add(jButton1);
        jButton1.setBounds(211, 361, 182, 29);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Osmar Jatoba Neto\\Desktop\\capybara_capybaracapybaracapybara.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(254, 286, 100, 69);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Osmar Jatoba Neto\\Desktop\\Cor de Fundo.jpg")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 610, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(MissaoConcluida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MissaoConcluida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MissaoConcluida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MissaoConcluida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MissaoConcluida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
