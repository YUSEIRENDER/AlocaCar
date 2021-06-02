package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;
import view.Cadastrologin;

public class FormCadastrologinController 
{
    
    //view a ser gerenciada pelo controller
    private Cadastrologin view;

    
    
    public FormCadastrologinController(Cadastrologin view)
    {
        this.view = view;
        
    }       
    
    public void inserir()
    {
        
        String nome = view.getjTextNome().getText();//nome recebe view como parametro e busca o campo jTextNome e pega o texto dele
        String cargo = String.valueOf(view.getjComboCargo().getSelectedItem());//cargo recebe valor string que recebe como parametro view que busca o campo 
        //JCombocargo e pega o item selecionado nele
        String login = view.getjTextLogin().getText();//usuario recebe view como parametro e busca o campo jTextLogin e pega o texto dele
        String senha = view.getjTextSenha().getText();//usuario recebe view como parametro e busca o campo jTextSenha e pega o texto dele
        String email = view.getjTextEmail().getText();//usuario recebe view como parametro e busca o campo jTextEmail e pega o texto dele
        
        Usuario user = new Usuario(nome, cargo, login, senha, email);
        
            //valida campos
            if(user.getNome().isEmpty() || user.getCargo().isEmpty() || user.getLogin().isEmpty() || user.getSenha().isEmpty() || user.getEmail().isEmpty())
            {
                
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                
            }
            else
            {//se estiverem preenchidos faça
                
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
                                                
            }    
        
    }        
    
}
