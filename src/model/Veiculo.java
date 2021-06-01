package model;

public class Veiculo 
{
    //definição de variaveis
    private String numero;
    private String placa;
    private String fabricante;
    private String modelo;
    private int anomodelo;
    private int qtdportas;
    private String acessorios;       

    //metodo contrutor

    public Veiculo(String numero, String placa, String fabricante, String modelo, int anomodelo, int qtdportas, String acessorios) {
        this.numero = numero;
        this.placa = placa;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anomodelo = anomodelo;
        this.qtdportas = qtdportas;
        this.acessorios = acessorios;
    }
    
    //metodos getters e setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnomodelo() {
        return anomodelo;
    }

    public void setAnomodelo(int anomodelo) {
        this.anomodelo = anomodelo;
    }

    public int getQtdportas() {
        return qtdportas;
    }

    public void setQtdportas(int qtdportas) {
        this.qtdportas = qtdportas;
    }

    public String getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }

}

