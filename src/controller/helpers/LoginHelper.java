/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.helpers;

import model.Usuario;
import view.Login;


public class LoginHelper {
    
    private final Login view;///buscar propriedade do tipo view
    
    //contrutor para a view

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    //função obter
    public Usuario obterUsuarioSenha()
    {
        
        //buscar um usuario da view
        String usuario = view.getjTextLogin1().getText();//usuario recebe view como parametro e busca o campo jTextLogin1 e pega o texto dele
        String senha = view.getjTextSenha().getText();//usuario recebe view como parametro e busca o campo jTextSenha e pega o texto dele
        
        Usuario userAutenticar = new Usuario(usuario, senha);
        return userAutenticar; 
        
    }
    
    //função setar
    public void setarUsuarioSenha(Usuario userAutenticar)
    {
        
        String login = userAutenticar.getNome();
        String senha = userAutenticar.getSenha();
        
        view.getjTextLogin1().setText(login);
        view.getjTextSenha().setText(senha);
    }        

        public void limparTela()
    {
        
        view.getjTextLogin1().setText("");
        view.getjTextSenha().setText("");     
        
    }      
    
}
