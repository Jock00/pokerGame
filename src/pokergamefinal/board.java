package pokergamefinal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexa
 */
public class board extends javax.swing.JFrame {

    /**
     * Creates new form board
     */
    public board() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Poker");
        setBackground(new java.awt.Color(7, 115, 81));
        setLocation(new java.awt.Point(200, 200));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 500, 500));
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setText("ROYAL FLUSH");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 0, 432, 34);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("ROYAL FLUSH");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 120, 432, 34);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel4.setText("ROYAL FLUSH");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 40, 432, 34);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setText("ROYAL FLUSH");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 80, 432, 34);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setText("ROYAL FLUSH");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 0, 432, 34);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel7.setText("ROYAL FLUSH");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 280, 432, 34);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel8.setText("ROYAL FLUSH");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 160, 432, 34);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel9.setText("ROYAL FLUSH");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 200, 432, 34);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel10.setText("ROYAL FLUSH");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 240, 432, 34);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 90, 690, 330);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("ROYAL FLUSH");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 480, 432, 34);

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
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
