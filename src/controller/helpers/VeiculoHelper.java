package controller.helpers;

import model.Veiculo;
import view.Cadastroveiculo;


public class VeiculoHelper {
    
    private final Cadastroveiculo view;//buscar propriedade do tipo view
    
    //conteudo da view

    public VeiculoHelper(Cadastroveiculo view) {
        this.view = view;
    }
    
    //funcão obter
    public Veiculo obterVeiculo()
    {
        
        //buscar um veiculo da view
        String numero = view.getjTextNome1().getText();//numero recebe view como parametro e busca o campo jTextNome e pega o texto dele
        String placa = view.getjTextPlaca().getText();//placa recebe view como parametro e busca o campo jTextPlaca e pega o texto dele
        String fabricante = view.getjTextFabricante().getText();//fabricante recebe o view como parametro e busca o campo jTextFabricante e pega o texto dele
        String modelo = view.getjTextModelo().getText();//modelo recebe o view como parametro e busca o campo jTextModelo e pega o texto dele
        int anomodelo = Integer.parseInt(view.getjTextAnomodelo().getText());//anomodelo recebe view como paramtro e busca o campo jTextAnomodelo e pega o texto dela
        int qtdportas = Integer.parseInt(view.getjTextQtdportas().getText());//qtdportas recebe view como parametro e busca o campo jTextQtdportas e pega o texto dele
        String acessorios = view.getjTextAcessorios().getText();//acessorios recebe view como parametro e busca o campo jTextAcessorios e pega o texto dele
        
        Veiculo veiculo = new Veiculo(numero, placa, fabricante, modelo, anomodelo, qtdportas, acessorios);
        
        return veiculo;
        
    }
    
    //função setar
    public void setVeiculo(Veiculo veiculo)
    {
        
        String numero = veiculo.getNumero();
        String placa = veiculo.getPlaca();
        String fabricante = veiculo.getFabricante();
        String modelo = veiculo.getModelo();
        int anomodelo = veiculo.getAnomodelo();
        int qtdportas = veiculo.getQtdportas();
        String acessorios = veiculo.getAcessorios();
        
        
        view.getjTextNome1().setText(numero);
        view.getjTextPlaca().setText(placa);
        view.getjTextFabricante().setText(fabricante);
        view.getjTextModelo().setText(modelo);
        view.getjTextAnomodelo().setText(String.valueOf(anomodelo));
        view.getjTextQtdportas().setText(String.valueOf(qtdportas));
        view.getjTextAcessorios().setText(acessorios);
      
        
    }
    
        public void limparTela()
    {
        
        view.getjTextNome1().setText("");
        view.getjTextPlaca().setText("");
        view.getjTextFabricante().setText("");
        view.getjTextModelo().setText("");
        view.getjTextAnomodelo().setText("");      
        view.getjTextQtdportas().setText("");     
        view.getjTextAcessorios().setText("");     
        
    }      
    
}
