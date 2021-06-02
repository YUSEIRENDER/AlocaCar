/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.FormCadastrologinController;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author marco
 */
public class Cadastrologin extends javax.swing.JInternalFrame {

    private final FormCadastrologinController controller; //criar campo controller em view

    /**
     * Creates new form Cadastrologin
     */
    public Cadastrologin() {
        initComponents();
        //adicionar controlador a view
        controller = new FormCadastrologinController(this); //criar campo controller em view
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
        btnDeletar = new javax.swing.JButton();
        btnCadastrar1 = new javax.swing.JButton();
        btnConsultar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLblfundo = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setTitle("Cadastro login");
        getContentPane().setLayout(null);

        jLblNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblNome.setForeground(new java.awt.Color(255, 255, 255));
        jLblNome.setText("Nome:");
        getContentPane().add(jLblNome);
        jLblNome.setBounds(270, 150, 60, 17);

        jTextNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextNomeKeyPressed(evt);
            }
        });
        getContentPane().add(jTextNome);
        jTextNome.setBounds(270, 170, 160, 22);

        jTextSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(jTextSenha);
        jTextSenha.setBounds(270, 290, 160, 22);

        jLblCargo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblCargo.setForeground(new java.awt.Color(255, 255, 255));
        jLblCargo.setText("Cargo:");
        getContentPane().add(jLblCargo);
        jLblCargo.setBounds(270, 190, 60, 17);

        jComboCargo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atendente", "Cliente" }));
        jComboCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboCargoKeyPressed(evt);
            }
        });
        getContentPane().add(jComboCargo);
        jComboCargo.setBounds(270, 210, 160, 22);

        jTextLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextLoginKeyPressed(evt);
            }
        });
        getContentPane().add(jTextLogin);
        jTextLogin.setBounds(270, 250, 160, 22);

        jLblLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLblLogin.setText("Login:");
        getContentPane().add(jLblLogin);
        jLblLogin.setBounds(270, 230, 60, 17);

        jLblSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLblSenha.setText("Senha:");
        getContentPane().add(jLblSenha);
        jLblSenha.setBounds(270, 270, 60, 17);

        jLblEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLblEmail.setText("Email:");
        getContentPane().add(jLblEmail);
        jLblEmail.setBounds(270, 310, 60, 17);

        jTextEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextEmailKeyPressed(evt);
            }
        });
        getContentPane().add(jTextEmail);
        jTextEmail.setBounds(270, 330, 160, 22);

        btnDeletar.setBackground(new java.awt.Color(0, 102, 102));
        btnDeletar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("DELETAR");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeletar);
        btnDeletar.setBounds(300, 380, 100, 20);

        btnCadastrar1.setBackground(new java.awt.Color(0, 102, 102));
        btnCadastrar1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnCadastrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar1.setText("CADASTRAR");
        btnCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrar1ActionPerformed(evt);
            }
        });
        btnCadastrar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCadastrar1KeyPressed(evt);
            }
        });
        getContentPane().add(btnCadastrar1);
        btnCadastrar1.setBounds(360, 360, 100, 20);

        btnConsultar1.setBackground(new java.awt.Color(0, 102, 102));
        btnConsultar1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnConsultar1.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar1.setText("CONSULTAR");
        btnConsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar1);
        btnConsultar1.setBounds(250, 360, 100, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cargo", "Login", "Senha", "Email"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(490, 20, 480, 402);

        jLblfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/login.png"))); // NOI18N
        getContentPane().add(jLblfundo);
        jLblfundo.setBounds(0, 0, 970, 430);

        setBounds(0, 0, 974, 456);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed

        //quando clicar no botao chamar o controlador para deletar um usuario
        //controller
        
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void jComboCargoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboCargoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)//ao pressionar botao enter peça o foco
        {
            
            jTextLogin.requestFocus();
            
        }          
    }//GEN-LAST:event_jComboCargoKeyPressed

    private void jTextNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNomeKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)//ao pressionar botao enter peça o foco
        {
            
            jComboCargo.requestFocus();
            
        }  
    }//GEN-LAST:event_jTextNomeKeyPressed

    private void jTextLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextLoginKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)//ao pressionar botao enter peça o foco
        {
            
            jTextSenha.requestFocus();
            
        }
    }//GEN-LAST:event_jTextLoginKeyPressed

    private void jTextSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSenhaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)//ao pressionar botao enter peça o foco
        {
            
            jTextEmail.requestFocus();
            
        }
    }//GEN-LAST:event_jTextSenhaKeyPressed

    private void jTextEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextEmailKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)//ao pressionar botao enter peça o foco
        {
            
            btnDeletar.requestFocus();
            
        }
    }//GEN-LAST:event_jTextEmailKeyPressed

    private void btnCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar1ActionPerformed
	//quando clicar no botao chamar o controlador para salvar um usuario
        controller.inserir();  
    }//GEN-LAST:event_btnCadastrar1ActionPerformed

    private void btnCadastrar1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCadastrar1KeyPressed
        //entrar apertando enter
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            
	//quando clicar no botao chamar o controlador para salvar um usuario
        controller.inserir();            
            
        }
        else
        {
            
            JOptionPane.showMessageDialog(this, "Erro ao inserir um usuario!");
            
        }
    }//GEN-LAST:event_btnCadastrar1KeyPressed

    private void btnConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultar1ActionPerformed
        // TODO add your handling code here:
        //controller
    }//GEN-LAST:event_btnConsultar1ActionPerformed

    //metodos getters e setters da view
    
    public JComboBox<String> getjComboCargo() {
        return jComboCargo;
    }

    public void setjComboCargo(JComboBox<String> jComboCargo) {
        this.jComboCargo = jComboCargo;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public JTextField getjTextEmail() {
        return jTextEmail;
    }

    public void setjTextEmail(JTextField jTextEmail) {
        this.jTextEmail = jTextEmail;
    }

    public JTextField getjTextLogin() {
        return jTextLogin;
    }

    public void setjTextLogin(JTextField jTextLogin) {
        this.jTextLogin = jTextLogin;
    }

    public JTextField getjTextNome() {
        return jTextNome;
    }

    public void setjTextNome(JTextField jTextNome) {
        this.jTextNome = jTextNome;
    }

    public JPasswordField getjTextSenha() {
        return jTextSenha;
    }

    public void setjTextSenha(JPasswordField jTextSenha) {
        this.jTextSenha = jTextSenha;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar1;
    private javax.swing.JButton btnConsultar1;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JComboBox<String> jComboCargo;
    private javax.swing.JLabel jLblCargo;
    private javax.swing.JLabel jLblEmail;
    private javax.swing.JLabel jLblLogin;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblSenha;
    private javax.swing.JLabel jLblfundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextLogin;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JPasswordField jTextSenha;
    // End of variables declaration//GEN-END:variables
}
