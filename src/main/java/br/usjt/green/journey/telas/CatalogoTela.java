package br.usjt.green.journey.telas;

/**
 *
 * @author eduar
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dashboardButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(695, 505));
        getContentPane().setLayout(null);

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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Missões");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(210, 0, 280, 70);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Descrição", "Pontos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 650, 370);

        dashboardButton.setText("Dashboard");
        getContentPane().add(dashboardButton);
        dashboardButton.setBounds(290, 430, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\ws-netbeans\\GreenJourney\\src\\main\\java\\br\\usjt\\green\\journey\\imagens\\cor_de_fundo.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 680, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboardButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
