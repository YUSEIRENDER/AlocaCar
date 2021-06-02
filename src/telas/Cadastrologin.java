/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import persistencia.Conexao;
import persistencia.UsuarioDAO;

/**
 *
 * @author marco
 */
public class Cadastrologin extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastrologin
     */
    public Cadastrologin() {
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

        jLblNome = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jTextSenha = new javax.swing.JPasswordField();
        jLblCargo = new javax.swing.JLabel();
        jComboCargo = new javax.swing.JComboBox<>();
        jTextLogin = new javax.swing.JTextField();
        jLblLogin = new javax.swing.JLabel();
        jLblSenha = new javax.swing.JLabel();
        jLblEmail = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLblfundo = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setTitle("Cadastro login");
        getContentPane().setLayout(null);

        jLblNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblNome.setForeground(new java.awt.Color(255, 255, 255));
        jLblNome.setText("Nome:");
        getContentPane().add(jLblNome);
        jLblNome.setBounds(310, 150, 60, 17);
        getContentPane().add(jTextNome);
        jTextNome.setBounds(310, 170, 160, 22);

        jTextSenha.setText("jPasswordField1");
        getContentPane().add(jTextSenha);
        jTextSenha.setBounds(310, 290, 160, 22);

        jLblCargo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblCargo.setForeground(new java.awt.Color(255, 255, 255));
        jLblCargo.setText("Cargo:");
        getContentPane().add(jLblCargo);
        jLblCargo.setBounds(310, 190, 60, 17);

        jComboCargo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atendente", "Usuario" }));
        getContentPane().add(jComboCargo);
        jComboCargo.setBounds(310, 210, 160, 22);
        getContentPane().add(jTextLogin);
        jTextLogin.setBounds(310, 250, 160, 22);

        jLblLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLblLogin.setText("Login:");
        getContentPane().add(jLblLogin);
        jLblLogin.setBounds(310, 230, 60, 17);

        jLblSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLblSenha.setText("Senha:");
        getContentPane().add(jLblSenha);
        jLblSenha.setBounds(310, 270, 60, 17);

        jLblEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLblEmail.setText("Email:");
        getContentPane().add(jLblEmail);
        jLblEmail.setBounds(310, 310, 60, 17);
        getContentPane().add(jTextEmail);
        jTextEmail.setBounds(310, 330, 160, 22);

        btnCadastrar.setBackground(new java.awt.Color(0, 102, 102));
        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(340, 370, 100, 20);

        jLblfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/loginn.png"))); // NOI18N
        getContentPane().add(jLblfundo);
        jLblfundo.setBounds(0, 0, 570, 430);

        setBounds(0, 0, 567, 456);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        String nome = jTextNome.getText();
        String cargo = String.valueOf(jComboCargo.getSelectedItem());
        String login = jTextLogin.getText();
        String senha = jTextSenha.getText();
        String email = jTextEmail.getText();
        
        Usuario user = new Usuario(nome, cargo, login, senha, email);
        
        try
        {
            
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
            usuarioDao.inserir(user);
            
            JOptionPane.showMessageDialog(null, "Usuario inserido com sucesso!");
            
        }
        catch(SQLException ex)
        {
            
            Logger.getLogger(Cadastrologin.class.getName()).log(Level.SEVERE, null, ex);
            
        }    
        
    }//GEN-LAST:event_btnCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> jComboCargo;
    private javax.swing.JLabel jLblCargo;
    private javax.swing.JLabel jLblEmail;
    private javax.swing.JLabel jLblLogin;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblSenha;
    private javax.swing.JLabel jLblfundo;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextLogin;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JPasswordField jTextSenha;
    // End of variables declaration//GEN-END:variables
}
