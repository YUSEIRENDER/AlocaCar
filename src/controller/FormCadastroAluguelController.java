package controller;

import controller.helpers.AluguelHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Aluguel;
import model.Veiculo;
import model.dao.AluguelDAO;
import model.dao.Conexao;
import model.dao.VeiculoDAO;
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
       else//se estiver preenchido faça
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
    
    public void AtualizarVeiculo()
    {
        
        //buscar veiculo do banco de dados
        //VeiculoDAO veiculoDao = VeiculoDAO();
        //ArrayList<Veiculo> veiculos = veiculoDao.selecioneTudo();
        //exibir veiculo no combobox
        //helper.obterVeiculo(veiculos);
    }        
}
