package controller;

import dao.Conexao;
import dao.ClienteDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;
import view.Cadastrocliente;

public class FormCadastroclienteController {
    
    //view a ser gerenciada pelo controller
    private Cadastrocliente view;
    
    public FormCadastroclienteController(Cadastrocliente view)
    {
        
       this.view = view;
        
    }
    
    public void inserir()
    {
        
       String nomecliente = view.getjTextNome1().getText();//nome recebe view como parametro e busca o campo jTextNome e pega o texto dele
       String endereco = view.getjTextEndereco().getText();//endereco recebe view como parametro e busca o campo JTextEndereco e pega o texto dele
       String uf = view.getjTextUF1().getText();//uf recebe view como parameto e busca o campo JTxtUf e pega o texto dele
       String telefone = view.getjTextTelefone().getText();//telefone recebe view como parametro e busca o campo JtxtTelefone e pega o texto dele
       Long cpf = Long.parseLong(view.getjTextCPF().getText());//cpf recebe view como parametro e busca o campo jTextCpf e pega o texto dele
       String email = view.getjTextEmail().getText();//email recebe view como parameto e busca o campo jTxtEmail e pega o texto dele
       
       Cliente cliente = new Cliente(nomecliente, endereco, uf, telefone, cpf, email);
       
       if(nomecliente.isEmpty() || endereco.isEmpty() || uf.isEmpty() || telefone.isEmpty() || cpf == 0 || email.isEmpty())
       {
           
           JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
           
       }
       else
       {
           
           try
           {
               
               Connection conexao = new Conexao().getConnection();
               ClienteDAO clienteDao = new ClienteDAO(conexao);
               clienteDao.inserir(cliente);
               
               JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!");
               
           }
           catch(SQLException ex)
           {
               
               Logger.getLogger(Cadastrocliente.class.getName()).log(Level.SEVERE, null, ex);
               
           }     
       }      
    }       
    
}
