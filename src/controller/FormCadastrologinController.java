package controller;

import controller.helpers.CadloginHelper;
import model.dao.Conexao;
import model.dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.Cadastrologin;

public class FormCadastrologinController 
{
    
    //view a ser gerenciada pelo controller
    private Cadastrologin view;
    private CadloginHelper helper;
    
    public FormCadastrologinController(Cadastrologin view)
    {
        this.view = view;
        this.helper = new CadloginHelper(view);
    }       
    //função inserir
    public void inserir()
    {
        
            Usuario user = helper.obterUsuario();//pegar modelo da tela no helper
        
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
            
                    JOptionPane.showMessageDialog(null, "Error ao inserir usuario no banco de dados!");
            
                }            
                                                
            }    
        
    }
    
    //função deletar
    public void deletar()
    {
        
        Usuario user = helper.obterUsuario();//pegar modelo da tela no helper
        
        //validar campos
        if(user.getNome().isEmpty() || user.getCargo().isEmpty() || user.getLogin().isEmpty() || user.getSenha().isEmpty() || user.getEmail().isEmpty())
        {
            
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            
        }
        else
        {//se estiverem preenchindos faça
            
            try
            {
                
                Connection conexao = new Conexao().getConnection();
                UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
                usuarioDao.deletar(user);
                
                JOptionPane.showMessageDialog(null, "Usuario deletado com sucesso!");
            }
            catch (SQLException ex)
            {
                
                JOptionPane.showMessageDialog(null, "Error ao deletar usuario no banco de dados!");
                
            }    
            
        }    
        
    }     
}
