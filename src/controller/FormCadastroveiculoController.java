package controller;

import controller.helpers.VeiculoHelper;
import model.dao.Conexao;
import model.dao.VeiculoDAO;
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
    private VeiculoHelper helper;
    
    public FormCadastroveiculoController(Cadastroveiculo view) 
    {
        
        this.view = view;
        this.helper = new VeiculoHelper(view);
        
    }
    
    public void inserir()
    {
        

        
        Veiculo veiculo = helper.obterVeiculo();//pegar modelo da tela no helper
        
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
