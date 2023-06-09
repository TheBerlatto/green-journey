/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.usjt.green.journey.telas;

import br.usjt.green.journey.model.Missao;
import br.usjt.green.journey.model.MissaoAtribuida;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vivia
 */
public class AdminMissoes extends javax.swing.JFrame {

    /**
     * Creates new form AdminMissoes
     */
    public AdminMissoes() {
        super("Gerenciamento de Missões");
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
        tituloMissaoTextField = new javax.swing.JTextField();
        descricaoMissaoTextField = new javax.swing.JTextField();
        dificuldadeTextField = new javax.swing.JTextField();
        pontosTextField = new javax.swing.JTextField();
        inserirMissaoButton = new javax.swing.JButton();
        atualizarMissaoButton = new javax.swing.JButton();
        deleteMissaoButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(675, 440));
        setSize(new java.awt.Dimension(670, 440));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(155, 219, 155));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gerenciamento de Missões");

        tituloMissaoTextField.setText("Título");
        tituloMissaoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloMissaoTextFieldActionPerformed(evt);
            }
        });

        descricaoMissaoTextField.setText("Descrição");
        descricaoMissaoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoMissaoTextFieldActionPerformed(evt);
            }
        });

        dificuldadeTextField.setText("Nível de Dificuldade");
        dificuldadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificuldadeTextFieldActionPerformed(evt);
            }
        });

        pontosTextField.setText("Pontos");
        pontosTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontosTextFieldActionPerformed(evt);
            }
        });

        inserirMissaoButton.setText("Inserir");
        inserirMissaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirMissaoButtonActionPerformed(evt);
            }
        });

        atualizarMissaoButton.setText("Atualizar");
        atualizarMissaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarMissaoButtonActionPerformed(evt);
            }
        });

        deleteMissaoButton.setText("Deletar");
        deleteMissaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMissaoButtonActionPerformed(evt);
            }
        });

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tituloMissaoTextField)
                            .addComponent(descricaoMissaoTextField)
                            .addComponent(dificuldadeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                            .addComponent(pontosTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deleteMissaoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inserirMissaoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(atualizarMissaoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(voltarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tituloMissaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descricaoMissaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dificuldadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pontosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inserirMissaoButton)
                    .addComponent(atualizarMissaoButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteMissaoButton)
                    .addComponent(voltarButton))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(110, 70, 417, 282);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("OBS: Para deletar uma missão, basta inserir o título!");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 370, 420, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\ws-netbeans\\GreenJourney\\src\\main\\java\\br\\usjt\\green\\journey\\imagens\\cor_de_fundo.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 680, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        Admin1 a1 = new Admin1();
        a1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void tituloMissaoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloMissaoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloMissaoTextFieldActionPerformed

    private void inserirMissaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirMissaoButtonActionPerformed
        try {
            // metodo que insere missões na tabela missões no banco
            //pegando os atributos necessario para a criação da missão
            String titulo = tituloMissaoTextField.getText();
            String descricao = descricaoMissaoTextField.getText();
            //parsea a string que vem do campo textField para int
            int nivelDificuldade = Integer.parseInt(dificuldadeTextField.getText());
            int pontos = Integer.parseInt(pontosTextField.getText());

            //instanciar objeto
            Missao missao = new Missao();
            //metodo da classe missão que ja instancia missaoDAO e insere no banco de dados
            missao.inserirMissao(titulo, descricao, nivelDificuldade, pontos);
            //metodo a seguir devolve o id da missão previamente cadastrada para o metodo
            // "inserirMissaoAtPorId" associa-la a todos os usuarios da plataforma
            MissaoAtribuida missaoAtribuida = new MissaoAtribuida();
            missaoAtribuida.inserirMissaoAtPorId(missao.consultarIdPeloTitulo(titulo));
            JOptionPane.showMessageDialog(null, "Missão criada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas técnicos. Tente novamente mais tarde");
            e.printStackTrace();
        }

    }//GEN-LAST:event_inserirMissaoButtonActionPerformed

    private void atualizarMissaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarMissaoButtonActionPerformed
        try {
            // atualizar a missão
            String titulo = tituloMissaoTextField.getText();
            String descricao = descricaoMissaoTextField.getText();
            int nivelDificuldade = Integer.parseInt(dificuldadeTextField.getText());
            int pontos = Integer.parseInt(pontosTextField.getText());
            Missao missao = new Missao();
            missao.alterarMissao(titulo, descricao, nivelDificuldade, pontos);
            JOptionPane.showMessageDialog(null, "Missão atualizada!", "Deletado", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas técnicos. Tente novamente mais tarde");
            e.printStackTrace();
        }
    }//GEN-LAST:event_atualizarMissaoButtonActionPerformed

    private void dificuldadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificuldadeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dificuldadeTextFieldActionPerformed

    private void pontosTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontosTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pontosTextFieldActionPerformed

    private void descricaoMissaoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoMissaoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoMissaoTextFieldActionPerformed

    private void deleteMissaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMissaoButtonActionPerformed
        try {
            // deleta missões que estão na tabela missão
            String titulo = tituloMissaoTextField.getText();
            //instancia do objeto missao que vamos utilizar
            Missao missao = new Missao();
            missao.deletarMissao(missao.consultarIdPeloTitulo(titulo));
            JOptionPane.showMessageDialog(null, "Missão deletada!", "Deletado", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas técnicos. Tente novamente mais tarde");
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteMissaoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMissoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMissoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMissoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMissoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMissoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarMissaoButton;
    private javax.swing.JButton deleteMissaoButton;
    private javax.swing.JTextField descricaoMissaoTextField;
    private javax.swing.JTextField dificuldadeTextField;
    private javax.swing.JButton inserirMissaoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pontosTextField;
    private javax.swing.JTextField tituloMissaoTextField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
