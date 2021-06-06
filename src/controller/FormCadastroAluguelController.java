package controller;

import controller.helpers.AluguelHelper;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Aluguel;
import model.dao.AluguelDAO;
import model.dao.Conexao;
import view.Cadastroaluguel;

public class FormCadastroAluguelController {
    
    //view a ser gerenciada pelo controller
    private Cadastroaluguel view;
    private AluguelHelper helper;

    public FormCadastroAluguelController(Cadastroaluguel view) {
        this.view = view;
        this.helper = new AluguelHelper(view);
    }
    
    public void inserir()
    {
        
        Aluguel aluguel = helper.obterAluguel();
        
       if(aluguel.getVeiculo().equals("") || aluguel.getDataaluguel().equals("") || aluguel.getDataentrega().equals("") || aluguel.getCliente().equals("") || aluguel.getEntregue().isEmpty() || aluguel.getValorpago().equals(""))
       {
           
           JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
           
       }
       else if(aluguel.getEntregue().equals("sim"))
       {
           
           try
           {
               
               Connection conexao = new Conexao().getConnection();
               AluguelDAO aluguelDao = new AluguelDAO(conexao);
               aluguelDao.inserir(aluguel);
               
               JOptionPane.showMessageDialog(null, "Aluguel inserido com sucesso!");
               
           }
           catch (SQLException ex)
           {
               
               JOptionPane.showMessageDialog(null, "Erro ao inserir Aluguel!");
               
           }        
           
       }    
        
    }
    
    public void deletar()
    {
        
        Aluguel aluguel = helper.obterAluguel();//pegar modelo da tela no helper
        
        if(aluguel.getVeiculo().equals("") || aluguel.getDataaluguel().equals("") || aluguel.getDataentrega().equals("") || aluguel.getCliente().equals("") || aluguel.getEntregue().isEmpty() || aluguel.getValorpago().equals(""))
        {
            
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            
        }
        else if(aluguel.getEntregue().equals("sim"))
        {
            
            try
            {
                
                Connection conexao = new Conexao().getConnection();
                AluguelDAO alugueldao = new AluguelDAO(conexao);
                alugueldao.deletar(aluguel);
                
                JOptionPane.showMessageDialog(null, "Aluguel deletado com sucesso!");
                
            }
            catch(SQLException ex)
            {
                
                JOptionPane.showMessageDialog(null, "Error ao aluguel cliente no banco de dados!");
                
            }    
            
        }    
        
    }        
         
}
