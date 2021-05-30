package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.Login;
import view.Menu;

public class LoginController 
{
    
    private Login view;//view login do controller

    //passando a view do logincontroller
    public LoginController(Login view) 
    {
        this.view = view;
    }

    public void autenticar() throws SQLException {//metodo autenticar
        
        //buscar um usuario da view
        String usuario = view.getjTextLogin1().getText();//usuario recebe view como parametro e busca o campo jTextLogin1 e pega o texto dele
        String senha = view.getjTextSenha().getText();//usuario recebe view como parametro e busca o campo jTextSenha e pega o texto dele
        
        Usuario userAutenticar = new Usuario(usuario, senha);
        
        //verificar se existe no banco de dados
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        
        //existe no banco?
        boolean existe = usuarioDao.existeUsuarioeSenha(userAutenticar);//jogue em existe se existir ou não no banco de dados
        
        //se existir direciona para menu
        if(existe)
        {
            
            Menu telaMenu = new Menu();
            telaMenu.setVisible(true);//torna a view menu visivel            
            
        }
        else
        {
            
            JOptionPane.showMessageDialog(view, "Usuario e/ou senha invalidos!");
            
        }    
    }
    
    
    
}
