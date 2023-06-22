package br.usjt.green.journey.telas;

import br.usjt.green.journey.dao.MissaoAtDAO;
import br.usjt.green.journey.dao.MissaoDAO;
import br.usjt.green.journey.dao.PessoaDAO;
import br.usjt.green.journey.model.MissaoAtribuida;
import br.usjt.green.journey.model.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author TheBerlatto
 */
public class CatalogoTela extends javax.swing.JFrame {

    /**
     * Creates new form CatalogoTela
     */
    public CatalogoTela() {
        super("Catálogo de Missões");
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

        usernameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dashboardButton = new javax.swing.JButton();
        missaoAtribuidaComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        concluirMissaoButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tituloTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        idTextArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        pontosTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(695, 505));
        setSize(new java.awt.Dimension(695, 505));
        getContentPane().setLayout(null);

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(51, 51, 51));
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(usernameLabel);
        usernameLabel.setBounds(340, 0, 230, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\ws-netbeans\\GreenJourney\\src\\main\\java\\br\\usjt\\green\\journey\\imagens\\foia canto superior esquerdo.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, 0, 80, 60);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 80, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\ws-netbeans\\GreenJourney\\src\\main\\java\\br\\usjt\\green\\journey\\imagens\\foia canto superior direito.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(597, 0, 80, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\ws-netbeans\\GreenJourney\\src\\main\\java\\br\\usjt\\green\\journey\\imagens\\foia_canto_inferior_esquerdo-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-10, 420, 80, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\ws-netbeans\\GreenJourney\\src\\main\\java\\br\\usjt\\green\\journey\\imagens\\foia canto inferior direito.png")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(597, 416, 80, 70);

        dashboardButton.setText("Voltar ao Dashboard");
        dashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardButtonActionPerformed(evt);
            }
        });
        getContentPane().add(dashboardButton);
        dashboardButton.setBounds(140, 400, 170, 40);

        missaoAtribuidaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                missaoAtribuidaComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(missaoAtribuidaComboBox);
        missaoAtribuidaComboBox.setBounds(100, 66, 480, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Missões de ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 0, 280, 70);

        concluirMissaoButton.setText("Concluir Missão");
        concluirMissaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirMissaoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(concluirMissaoButton);
        concluirMissaoButton.setBounds(350, 400, 200, 40);

        descricaoTextArea.setEditable(false);
        descricaoTextArea.setColumns(20);
        descricaoTextArea.setLineWrap(true);
        descricaoTextArea.setRows(5);
        descricaoTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));
        jScrollPane1.setViewportView(descricaoTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 180, 450, 150);

        tituloTextArea.setEditable(false);
        tituloTextArea.setColumns(20);
        tituloTextArea.setRows(1);
        tituloTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Título"));
        jScrollPane2.setViewportView(tituloTextArea);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(230, 120, 340, 60);

        idTextArea.setEditable(false);
        idTextArea.setColumns(20);
        idTextArea.setLineWrap(true);
        idTextArea.setRows(1);
        idTextArea.setAutoscrolls(false);
        idTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Id"));
        jScrollPane3.setViewportView(idTextArea);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(120, 120, 100, 60);

        pontosTextArea.setEditable(false);
        pontosTextArea.setColumns(20);
        pontosTextArea.setRows(1);
        pontosTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Pontos"));
        jScrollPane4.setViewportView(pontosTextArea);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(120, 330, 450, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\ws-netbeans\\GreenJourney\\src\\main\\java\\br\\usjt\\green\\journey\\imagens\\cor_de_fundo.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 680, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void missaoAtribuidaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_missaoAtribuidaComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_missaoAtribuidaComboBoxActionPerformed

    private void concluirMissaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluirMissaoButtonActionPerformed
        MissaoAtribuida missaoAt = new MissaoAtribuida();
        PessoaDAO pessoaDAO = new PessoaDAO();

        int idMissao;
        int idUsuario;
        String username = usernameLabel.getText();
        try {
            idMissao = Integer.parseInt(idTextArea.getText());
            idUsuario = pessoaDAO.consultarIdPeloUsername(username);
            missaoAt.concluirMissao(idUsuario, idMissao);
            pessoaDAO.atribuirPontosPorMissao(username, Integer.parseInt(pontosTextArea.getText()));
            MissaoConcluidaTela mct = new MissaoConcluidaTela();
            mct.receberUsername(username);
            mct.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Todas as missões já foram concluídas, parabéns!", "Oops", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_concluirMissaoButtonActionPerformed

    private void dashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardButtonActionPerformed
        DashboardTela dt = new DashboardTela();
        dt.receberUsername(usernameLabel.getText());
        dt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboardButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CatalogoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogoTela().setVisible(true);
            }
        });
    }

    public void buscarMissoesAt() {
        try {
            MissaoAtDAO missaoAtDAO = new MissaoAtDAO();
            Usuario usuario = new Usuario();
            MissaoAtribuida[] missoes = missaoAtDAO.obterMissoesAtFinalizadas(usuario.consultarIdPeloUsername(usernameLabel.getText()));
            MissaoDAO daoMissao = new MissaoDAO();

            for (MissaoAtribuida misAt : missoes) {
                misAt.setMissao(daoMissao.consultarPorId(misAt.getMissao().getId()));
                idTextArea.setText(String.valueOf(misAt.getMissao().getId()));
                tituloTextArea.setText(misAt.getMissao().getTitulo());
                descricaoTextArea.setText(misAt.getMissao().getDescricao());
                pontosTextArea.setText(String.valueOf(misAt.getMissao().getPontos()));
            }

            missaoAtribuidaComboBox.setModel(new DefaultComboBoxModel<>(missoes));

            idTextArea.setText("");
            tituloTextArea.setText("");
            descricaoTextArea.setText("");
            pontosTextArea.setText("");

            missaoAtribuidaComboBox.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    MissaoAtribuida selectedMisAt = (MissaoAtribuida) missaoAtribuidaComboBox.getSelectedItem();
                    if (selectedMisAt != null) {
                        idTextArea.setText(String.valueOf(selectedMisAt.getMissao().getId()));
                        tituloTextArea.setText(selectedMisAt.getMissao().getTitulo());
                        descricaoTextArea.setText(selectedMisAt.getMissao().getDescricao());
                        pontosTextArea.setText(String.valueOf(selectedMisAt.getMissao().getPontos()));
                    }
                }
            });

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Missões indisponíveis... Tente novamente mais tarde!", "Oops", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    //Recebe o username de quem logou!
    public void receberUsername(String username) {
        usernameLabel.setText(username);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton concluirMissaoButton;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JTextArea descricaoTextArea;
    private javax.swing.JTextArea idTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<MissaoAtribuida> missaoAtribuidaComboBox;
    private javax.swing.JTextArea pontosTextArea;
    private javax.swing.JTextArea tituloTextArea;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

}
