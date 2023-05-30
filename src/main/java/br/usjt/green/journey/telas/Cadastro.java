/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.usjt.green.journey.telas;

/**
 *
 * @author Osmar Jatoba Neto
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        super("Cadastro");
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        cadastroButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(555, 355));
        getContentPane().setLayout(null);

        emailTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(emailTextField);
        emailTextField.setBounds(160, 100, 220, 40);

        usernameTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Username"));
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernameTextField);
        usernameTextField.setBounds(160, 150, 220, 40);

        passwordTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));
        getContentPane().add(passwordTextField);
        passwordTextField.setBounds(160, 200, 220, 40);

        cadastroButton.setText("Finalizar");
        cadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cadastroButton);
        cadastroButton.setBounds(220, 260, 100, 30);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 220, 80, 0);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 10, 0, 0);

        logoLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\ws-netbeans\\GreenJourney\\src\\main\\java\\br\\usjt\\green\\journey\\imagens\\teste-removebg-preview.png")); // NOI18N
        getContentPane().add(logoLabel);
        logoLabel.setBounds(170, 20, 220, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\ws-netbeans\\GreenJourney\\src\\main\\java\\br\\usjt\\green\\journey\\imagens\\cor_de_fundo.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 560, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void cadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButtonActionPerformed
        // botão que faz o cadastro usuario
        String email = emailTextField.getText();
        //recebe o nome do usuario
        String username = usernameTextField.getText();
        String senha = new String(passwordTextField.getPassword());
        /*
        try {
            Usuario usuario = new Usuario (login, senha);
            DAO dao = new DAO();
            if (dao.existeUsuario(usuario)) {
                JOptionPane.showMessageDialog(null, "Bem-vindo, " + login, "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
                dt.setVisible(true);
                this.dispose();
            }
            else {
                JOptionPane.showMessageDialog(null, "Usuario não cadastrado", 
                "Ups", JOptionPane.WARNING_MESSAGE);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog (null, "ups, tente mais tarde");
            e.printStackTrace();
        }
        //--------------------*/
        
    }//GEN-LAST:event_cadastroButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
