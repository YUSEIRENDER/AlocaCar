package controller;

import dao.Conexao;
import dao.VeiculoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Veiculo;
import view.Cadastrocliente;
import view.Cadastroveiculo;



public class FormCadastroveiculoController {

    //view a ser gerenciada pelo controller
    private Cadastroveiculo view;    
    
    public FormCadastroveiculoController(Cadastroveiculo view) 
    {
        
        this.view = view;
        
    }
    
    public void inserir()
    {
        
        String numero = view.getjTextNome1().getText();//numero recebe view como parametro e busca o campo jTextNome1 e pega o texto dele
        String placa = view.getjTextPlaca().getText();//placa recebe view como parametro e busca o campo jTextPlaca e pega o texto dele
        String fabricante = view.getjTextFabricante().getText();//placa recebe view como parametro e busca campo jTextFabricante e pega o texto dele
        String modelo = view.getjTextModelo().getText();//modelo recebe view como parametro e busca campo jTextModelo() e pega o texto dele
        int anomodelo = Integer.parseInt(view.getjTextAnomodelo().getText());//recebe view como parametro e busca campo jTextAnoModelo e pega o texto dele
        int qtdportas = Integer.parseInt(view.getjTextQtdportas().getText());//recebe view como parametro e busca campo jTextQtdportas e pega o texto dele
        String acessorios = view.getjTextAcessorios().getText();//recebe view como parametro e busca campo jTextAcessorios e paga o texto dele
        
        Veiculo veiculo = new Veiculo(numero, placa, fabricante, modelo, anomodelo, qtdportas, acessorios);
        
        //valida campos
        if(numero.isEmpty() || placa.isEmpty()|| fabricante.isEmpty()|| modelo.isEmpty()|| anomodelo == 0 || qtdportas == 0 || acessorios.isEmpty())
        {
            
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            
        }
        else
        {
            
            try
            {
                
                Connection conexao = new Conexao().getConnection();
                VeiculoDAO veiculoDao = new VeiculoDAO(conexao);
                veiculoDao.inserir(veiculo);
                
                JOptionPane.showMessageDialog(null, "Veiculo inserido com sucesso!");
            }
            catch (SQLException ex)
            {
                
                Logger.getLogger(Cadastrocliente.class.getName()).log(Level.SEVERE, null, ex);
                
            }    
        }    
  
    }        
    
}
