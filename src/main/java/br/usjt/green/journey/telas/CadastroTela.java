package br.usjt.green.journey.telas;

import br.usjt.green.journey.dao.PessoaDAO;
import br.usjt.green.journey.model.MissaoAtribuida;
import br.usjt.green.journey.model.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Osmar Jatoba Neto
 */
public class CadastroTela extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public CadastroTela() {
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
        finalizarButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        voltarButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        termosCheckBox = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        termosButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(575, 390));
        setResizable(false);
        setSize(new java.awt.Dimension(575, 390));
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
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(passwordTextField);
        passwordTextField.setBounds(160, 200, 220, 40);

        finalizarButton.setText("Finalizar");
        finalizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(finalizarButton);
        finalizarButton.setBounds(340, 280, 100, 30);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 220, 80, 0);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 10, 0, 0);

        logoLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\ws-netbeans\\GreenJourney\\src\\main\\java\\br\\usjt\\green\\journey\\imagens\\teste-removebg-preview.png")); // NOI18N
        getContentPane().add(logoLabel);
        logoLabel.setBounds(170, 20, 220, 70);

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarButton);
        voltarButton.setBounds(100, 280, 90, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\ws-netbeans\\GreenJourney\\src\\main\\java\\br\\usjt\\green\\journey\\imagens\\foia canto superior esquerdo.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-10, 0, 80, 60);

        termosCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termosCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(termosCheckBox);
        termosCheckBox.setBounds(60, 250, 20, 19);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\ws-netbeans\\GreenJourney\\src\\main\\java\\br\\usjt\\green\\journey\\imagens\\foia canto superior direito.png")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(477, 0, 80, 60);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\ws-netbeans\\GreenJourney\\src\\main\\java\\br\\usjt\\green\\journey\\imagens\\foia_canto_inferior_esquerdo-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 296, 80, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\ws-netbeans\\GreenJourney\\src\\main\\java\\br\\usjt\\green\\journey\\imagens\\foia canto inferior direito.png")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(477, 296, 80, 60);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ao clicar em finalizar, você declara que aceita os Termos de Uso");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 250, 420, 20);

        termosButton.setText("Termos de Uso");
        termosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termosButtonActionPerformed(evt);
            }
        });
        getContentPane().add(termosButton);
        termosButton.setBounds(200, 280, 130, 30);

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

    // botão que faz o cadastro usuario
    private void finalizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarButtonActionPerformed
        if (termosCheckBox.isSelected()) {
            String email = emailTextField.getText();
            String username = usernameTextField.getText();
            String senha = new String(passwordTextField.getPassword());

            PessoaDAO pessoaDAO = new PessoaDAO();
            Usuario usuario = new Usuario();

            try {
                if (!pessoaDAO.consultarSeExistir(usuario)) {
                    if (!email.isEmpty() && !username.isEmpty() && !senha.isEmpty()) {
                        usuario.setEmail(email);
                        usuario.setUsername(username);
                        usuario.setSenha(senha);

                        pessoaDAO.inserir(usuario);
                        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso", "Oops", JOptionPane.INFORMATION_MESSAGE);
                        DashboardTela dt = new DashboardTela();
                        MissaoAtribuida missaoAtribuida = new MissaoAtribuida();
                        missaoAtribuida.inserirMissaoAt(usuario.getUsername());
                        dt.receberUsername(username);
                        dt.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios, preencha-os!", "Oops", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ja existe", "Oops", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar-se, tente novamente mais tarde!", "Oops", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Aceite os termos de Uso!", "Oops", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_finalizarButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        LoginTela lt = new LoginTela();
        lt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void termosCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termosCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_termosCheckBoxActionPerformed

    private void termosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termosButtonActionPerformed
        TermosTela tt = new TermosTela();
        tt.setVisible(true);
    }//GEN-LAST:event_termosButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton finalizarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton termosButton;
    private javax.swing.JCheckBox termosCheckBox;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
