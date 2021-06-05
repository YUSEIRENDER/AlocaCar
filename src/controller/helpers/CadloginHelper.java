package controller.helpers;

import model.Usuario;
import view.Cadastrologin;

public class CadloginHelper 
{
    
    private final Cadastrologin view;

    public CadloginHelper(Cadastrologin view) {
        this.view = view;
    }
    
    public Usuario obterUsuario()
    {
        
        String nome = view.getjTextNome().getText();//nome recebe view como parametro e busca o campo jTextNome e pega o texto dele
        String cargo = String.valueOf(view.getjComboCargo().getSelectedItem());//cargo recebe valor string que recebe como parametro view que busca o campo 
        //JCombocargo e pega o item selecionado nele
        String login = view.getjTextLogin().getText();//usuario recebe view como parametro e busca o campo jTextLogin e pega o texto dele
        String senha = view.getjTextSenha().getText();//usuario recebe view como parametro e busca o campo jTextSenha e pega o texto dele
        String email = view.getjTextEmail().getText();//usuario recebe view como parametro e busca o campo jTextEmail e pega o texto dele
        
        Usuario user = new Usuario(nome, cargo, login, senha, email);        
        
        return user;
    }
    
    public void setarModelo(Usuario user)
    {
        
        String nome = user.getNome();
        String cargo = user.getCargo();
        String login = user.getLogin();
        String senha = user.getSenha();
        String email = user.getEmail();
        
        view.getjTextNome().setText(nome);
        view.getjComboCargo().setSelectedItem(cargo);
        view.getjTextLogin().setText(login);
        view.getjTextSenha().setText(senha);
        view.getjTextEmail().setText(email);
        
    }
    
    public void limparTela()
    {
        
        view.getjTextNome().setText("");
        view.getjComboCargo().setSelectedItem("");
        view.getjTextLogin().setText("");
        view.getjTextSenha().setText("");
        view.getjTextEmail().setText("");        
        
    }        
}
