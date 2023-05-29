/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.usjt.green.journey.telas;

import br.usjt.green.journey.dao.PessoaDAO;
import br.usjt.green.journey.model.Pessoa;
import br.usjt.green.journey.model.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author TheBerlatto
 */
public class LoginTela extends javax.swing.JFrame {

    /**
     * Creates new form LoginTela
     */
    public LoginTela() {
        super("Bem-vindo(a) a Green Journey");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginTextField = new javax.swing.JTextField();
        senhaPasswordField = new javax.swing.JPasswordField();
        sairButton = new javax.swing.JButton();
        entrarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setEnabled(false);
        setFocusable(false);
        getContentPane().setLayout(null);

        loginTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Digite seu username:"));
        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(loginTextField);
        loginTextField.setBounds(390, 140, 170, 49);

        senhaPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder("Digite sua senha:"));
        getContentPane().add(senhaPasswordField);
        senhaPasswordField.setBounds(390, 210, 170, 49);

        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sairButton);
        sairButton.setBounds(390, 270, 70, 29);

        entrarButton.setText("Entrar");
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(entrarButton);
        entrarButton.setBounds(470, 270, 90, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Osmar Jatoba Neto\\Desktop\\green-journey-master\\src\\main\\java\\br\\usjt\\green\\journey\\imagens\\teste-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 150, 200, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Osmar Jatoba Neto\\Desktop\\foia canto inferior direito.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 350, 100, 80);

        jTextField1.setText("Ajude o planeta com pequenas  atitudes.  ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(20, 230, 310, 31);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Osmar Jatoba Neto\\Desktop\\foia_canto_inferior_esquerdo.png")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-10, 340, 90, 90);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Osmar Jatoba Neto\\Desktop\\foia canto superior esquerdo.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-10, -10, 90, 90);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Osmar Jatoba Neto\\Desktop\\foia canto superior direito.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(520, -10, 90, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Osmar Jatoba Neto\\Desktop\\green-journey-master\\src\\main\\java\\br\\usjt\\green\\journey\\imagens\\Cor de Fundo.jpg")); // NOI18N
        jLabel2.setText("dsfsdf");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed
        String username = loginTextField.getText();
        String senha = new String(senhaPasswordField.getPassword());
        
        try {
            //verificar se o usuario existe no db
            Usuario usuario = new Usuario(username, senha);
            PessoaDAO dao = new PessoaDAO();
            
            if (dao.consultarSeExistir(usuario)) {
                JOptionPane.showMessageDialog(null, "Bem vindo, " + usuario.getUsername() + "!", "Olá!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Usuário Inválido!", "Oops", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog (null, "Problemas técnicos. Tente novamente mais tarde");
            e.printStackTrace();
        }
    }//GEN-LAST:event_entrarButtonActionPerformed

    private void loginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JButton sairButton;
    private javax.swing.JPasswordField senhaPasswordField;
    // End of variables declaration//GEN-END:variables
}
