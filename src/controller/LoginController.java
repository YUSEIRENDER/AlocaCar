package controller;

import controller.helpers.LoginHelper;
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
    private LoginHelper helper;

    //passando a view do logincontroller
    public LoginController(Login view) 
    {
        this.view = view;
        this.helper = new LoginHelper(view);
    }

    public void autenticar() throws SQLException {//metodo autenticar
        
        //pegar usuario da view
        Usuario usuario = helper.obterUsuarioSenha();//pede para o helper pegar os campos login e colocar numa variavel tipo usuario
        
        //verificar se existe no banco de dados
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        
        //existe no banco?
        boolean existe = usuarioDao.existeUsuarioeSenha(usuario);//jogue em existe se existir ou não no banco de dados
        
        //se existir direciona para menu
        if(existe)
        {
            
            Menu telaMenu = new Menu();
            telaMenu.setVisible(true);//torna a view menu visivel  
            this.view.dispose();//esconde a iew login ao abrir o menu
            
        }
        else
        {
            
            JOptionPane.showMessageDialog(view, "Usuario e/ou senha invalidos!");//mostra usuario e/ou senha invalidos
            
        }    
    }
    
    
    
}