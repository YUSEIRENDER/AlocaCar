package controller;

import controller.helpers.ClienteHelper;
import model.dao.Conexao;
import model.dao.ClienteDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;
import view.Cadastrocliente;

public class FormCadastroclienteController {
    
    //view a ser gerenciada pelo controller
    private Cadastrocliente view;
    private ClienteHelper helper;
    
    public FormCadastroclienteController(Cadastrocliente view)
    {
        
       this.view = view;
        this.helper = new ClienteHelper(view);
    }
    
    public void inserir()
    {
        
        Cliente cliente = helper.obterCliente();
       
       if(cliente.getNomecliente().isEmpty() || cliente.getEndereco().isEmpty() || cliente.getUf().isEmpty() || cliente.getTelefone().isEmpty() || cliente.getCpf().equals(0) || cliente.getEmail().isEmpty())
       {
           
           JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
           
       }
       else
       {//se estiverem preenchidos faça
           
           try
           {
               
               Connection conexao = new Conexao().getConnection();
               ClienteDAO clienteDao = new ClienteDAO(conexao);
               clienteDao.inserir(cliente);
               
               JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!");
               
           }
           catch(SQLException ex)
           {
               
               JOptionPane.showMessageDialog(null, "Erro ao inserir cliente no banco de dados!");
               
           }     
       }      
    }
    
    public void deletar()
    {
        
        Cliente cliente = helper.obterCliente();//pegar modelo da tela no helper
        
        if(cliente.getNomecliente().isEmpty() || cliente.getEndereco().isEmpty() || cliente.getUf().isEmpty() || cliente.getTelefone().isEmpty() || cliente.getCpf().equals("") || cliente.getEmail().isEmpty())
        {
            
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            
        }
        else
        {//se estiverem preenchindos faça
            
            try
            {
                
                Connection conexao = new Conexao().getConnection();
                ClienteDAO clienteDAO = new ClienteDAO(conexao);
                clienteDAO.deletar(cliente);
                
                JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso!");
                
            }
            catch (SQLException ex)
            {
                
                JOptionPane.showMessageDialog(null, "Error ao deletar cliente no banco de dados!");
                
            }    
            
        }    
        
    }        
    
}
