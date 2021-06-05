package controller.helpers;

import java.util.Date;
import model.Aluguel;
import model.Cliente;
import model.Veiculo;
import view.Cadastroaluguel;


public class AluguelHelper {
    
    private final Cadastroaluguel view;

    //conteudo da view
    public AluguelHelper(Cadastroaluguel view) {
        this.view = view;
    }

    public Aluguel obterAluguel()
    {
        int idaluguel = Integer.parseInt(view.getjTextId().getText());
        Veiculo veiculo = obterVeiculo();//obterveiculo
        String dataaluguel = view.getjDateAluguel().getText();
        String dataentrega = view.getjDateEntrega().getText();
        Cliente cliente = obterCliente();//obtercliente
        String entregue = view.getjTextEntregue().getText();
        String observacao = view.getjTextObservacao().getText();
        Float valorpago = Float.parseFloat(view.getjTextValorpago().getText());
        
        Aluguel aluguel = new Aluguel(idaluguel, veiculo, dataaluguel, dataentrega, cliente, entregue, observacao, valorpago);
        
        return aluguel;
    }  
    
    public Veiculo obterVeiculo() {//metodo obter veiculo
        return (Veiculo) view.getjComboBoxVeiculo().getSelectedItem();
    }
    
    public Cliente obterCliente(){//metodo obter cliente
        return (Cliente) view.getjComboBoxCliente().getSelectedItem();
    } 
    
    //setar modelo
    public void setarModelo(Aluguel aluguel)
    {
        
        int idaluguel = aluguel.getIdaluguel();
        Veiculo veiculo = aluguel.getVeiculo();
        Date dataaluguel = aluguel.getDataaluguel();
        Date dateentrega = aluguel.getDataentrega();
        Cliente cliente = aluguel.getCliente();
        String entregue = aluguel.getEntregue();
        String observacao = aluguel.getObservacao();
        Float valorpago = aluguel.getValorpago();
        
        view.getjTextId().setText("");
        view.getjComboBoxVeiculo().setSelectedItem("");
        view.getjDateAluguel().setText("");
        view.getjDateEntrega().setText("");
        view.getjComboBoxCliente().setSelectedItem("");
        view.getjTextEntregue().setText("");
        view.getjTextObservacao().setText("");
        view.getjTextValorpago().setText("");
        
    } 
    
        public void limparTela()
    {
        
        view.getjTextId().setText("");
        view.getjComboBoxVeiculo().setSelectedItem("");
        view.getjDateAluguel().setText("");
        view.getjDateEntrega().setText("");
        view.getjComboBoxCliente().setSelectedItem("");
        view.getjTextEntregue().setText("");
        view.getjTextObservacao().setText("");
        view.getjTextValorpago().setText("");
    }  
    
}
