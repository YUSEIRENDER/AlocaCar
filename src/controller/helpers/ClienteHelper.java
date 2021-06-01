package controller.helpers;

import model.Cliente;
import view.Cadastrocliente;//importação da view


public class ClienteHelper {

    private final Cadastrocliente view;//buscar propriedade do tipo view
    
    //contrutor para a view

    public ClienteHelper(Cadastrocliente view) {
        this.view = view;
    }
    
    //função obter
    public Cliente obterCliente()
    {
        
        //buscar um usuario da view
        String nomecliente = view.getjTextNome1().getText();//nome recebe view como parametro e busca o campo jTextNome e pega o texto dele
        String endereco = view.getjTextEndereco().getText();//endereco recebe view como parametro e busca o campo JTextEndereco e pega o texto dele
        String uf = view.getjTextUF1().getText();//uf recebe view como parameto e busca o campo JTxtUf e pega o texto dele
        String telefone = view.getjTextTelefone().getText();//telefone recebe view como parametro e busca o campo JtxtTelefone e pega o texto dele
        int cpf = Integer.parseInt(view.getjTextCPF().getText());//cpf recebe view como parametro e busca o campo jTextCpf e pega o texto dele
        String email = view.getjTextEmail().getText();//email recebe view como parameto e busca o campo jTxtEmail e pega o texto dele
        
        Cliente cliente = new Cliente(nomecliente, endereco, uf, telefone, cpf, email);
        
        return cliente;
    }
    
    //função setar
    public void setCliente(Cliente cliente)        
    {
        
        String nomecliente = cliente.getNomecliente();
        String endereco = cliente.getEndereco();
        String uf = cliente.getUf();
        String telefone = cliente.getTelefone();
        int cpf = cliente.getCpf();
        String email = cliente.getEmail();
        
        view.getjTextNome1().setText(nomecliente);
        view.getjTextEndereco().setText(endereco);
        view.getjTextUF1().setText(uf);
        view.getjTextTelefone().setText(telefone);
        view.getjTextCPF().setText(String.valueOf(cpf));
        view.getjTextEmail().setText(email);
        
    }        
    
}
