/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.usjt.green.journey.telas;

import br.usjt.green.journey.dao.PessoaDAO;
import br.usjt.green.journey.model.MissaoAtribuida;
import br.usjt.green.journey.model.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vivia
 */
public class AdminUsuario extends javax.swing.JFrame {

    /**
     * Creates new form AdminUsuario
     */
    public AdminUsuario() {
        super("Gerenciamento de Usuários");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        inserirButton = new javax.swing.JButton();
        atualizarButton = new javax.swing.JButton();
        deletarButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        passwordTextField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(675, 440));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(155, 220, 155));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gerenciamento de Usuários");

        usernameTextField.setText("Username");
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        emailTextField.setText("Email");

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirButtonActionPerformed(evt);
            }
        });

        atualizarButton.setText("Atualizar");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        deletarButton.setText("Deletar");
        deletarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarButtonActionPerformed(evt);
            }
        });

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        passwordTextField.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameTextField)
                            .addComponent(emailTextField)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inserirButton)
                            .addComponent(deletarButton))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(atualizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(voltarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inserirButton)
                    .addComponent(atualizarButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletarButton)
                    .addComponent(voltarButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(130, 70, 411, 254);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 680, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void inserirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirButtonActionPerformed
        // administrador cadastra usuarios no banco
        String username = usernameTextField.getText();
        String email = emailTextField.getText();
        String senha = new String(passwordTextField.getPassword());
        
        PessoaDAO pessoaDAO = new PessoaDAO();
        Usuario usuario =  new Usuario();
        
        try {
            if (!pessoaDAO.consultarSeExistir(usuario)) {
                usuario.setUsername(username);
                usuario.setEmail(email);
                usuario.setSenha(senha);
                
                pessoaDAO.inserir(usuario);
                JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso", "Oops", JOptionPane.INFORMATION_MESSAGE);
                MissaoAtribuida missaoAtribuida = new MissaoAtribuida();
                missaoAtribuida.inserirMissaoAt(usuario.getUsername());
            }
            else {
                //lembrar de criar o construtor
                JOptionPane.showMessageDialog(null, "Usuario ja existe", "Oops", JOptionPane.WARNING_MESSAGE);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog (null, "Erro ao cadastrar-se, tente novamente mais tarde!", "Oops", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_inserirButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        Admin1 a1 = new Admin1();
        a1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        try {
            // atualizar dados do usuario
            String username = usernameTextField.getText();
            String email = emailTextField.getText();
            String senha = new String(passwordTextField.getPassword());
            //instancia objeto Usuario
            Usuario usuario = new Usuario();
            //colocar condição de existir usando "consultarSeExistir"
            usuario.alterar(username, email, senha);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog (null, "Erro ao atualizar, tente novamente mais tarde!", "Oops", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_atualizarButtonActionPerformed

    private void deletarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarButtonActionPerformed
        try {
            // deleta usuariodo banco
            String username = usernameTextField.getText();
            String email = emailTextField.getText();
            String senha = new String(passwordTextField.getPassword());
            //instancia do objeto usuario
            Usuario usuario = new Usuario();
            //seguinte metodo devolve o id do usuario para o metodo buscar e deletar
            usuario.deletar(usuario.consultarIdPeloUsername(username));
            
        } catch (Exception ex) {
            Logger.getLogger(AdminUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_deletarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarButton;
    private javax.swing.JButton deletarButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton inserirButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
