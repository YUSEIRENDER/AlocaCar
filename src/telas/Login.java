package telas;

import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);//inicia o programa centralizado
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLblLogin1 = new javax.swing.JLabel();
        jTextLogin1 = new javax.swing.JTextField();
        jTextSenha = new javax.swing.JPasswordField();
        jLblSenha = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnEntrar2 = new javax.swing.JButton();
        jLabelImgLogin = new javax.swing.JLabel();
        JLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(718, 467));
        getContentPane().setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("ALOCACAR");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(250, 10, 200, 40);

        jLblLogin1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblLogin1.setForeground(new java.awt.Color(255, 255, 255));
        jLblLogin1.setText("Login:");
        getContentPane().add(jLblLogin1);
        jLblLogin1.setBounds(350, 240, 60, 17);
        getContentPane().add(jTextLogin1);
        jTextLogin1.setBounds(350, 260, 160, 22);

        jTextSenha.setText("jPasswordField1");
        getContentPane().add(jTextSenha);
        jTextSenha.setBounds(350, 320, 160, 22);

        jLblSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLblSenha.setText("Senha:");
        getContentPane().add(jLblSenha);
        jLblSenha.setBounds(350, 290, 60, 17);

        btnSair.setBackground(new java.awt.Color(0, 102, 102));
        btnSair.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(350, 350, 59, 21);

        btnEntrar2.setBackground(new java.awt.Color(0, 102, 102));
        btnEntrar2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnEntrar2.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar2.setText("ENTRAR");
        btnEntrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar2);
        btnEntrar2.setBounds(438, 350, 75, 21);

        jLabelImgLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/login.png"))); // NOI18N
        getContentPane().add(jLabelImgLogin);
        jLabelImgLogin.setBounds(110, 60, 490, 410);

        JLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/desfoque.png"))); // NOI18N
        getContentPane().add(JLabelFundo);
        JLabelFundo.setBounds(0, 0, 720, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);//sai do sistema
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEntrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar2ActionPerformed
        // TODO add your handling code here:
        //entra na tela de menu
        Menu telaMenu = new Menu();
        telaMenu.setVisible(true);
        
    }//GEN-LAST:event_btnEntrar2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelFundo;
    private javax.swing.JButton btnEntrar2;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabelImgLogin;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLblLogin1;
    private javax.swing.JLabel jLblSenha;
    private javax.swing.JTextField jTextLogin1;
    private javax.swing.JPasswordField jTextSenha;
    // End of variables declaration//GEN-END:variables
}
