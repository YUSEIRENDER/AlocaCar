package model;

import java.util.Date;

public class Veiculo extends Aluguel
{
    //definição de variaveis
    private int numero;
    private String placa;
    private String fabricante;
    private String modelo;
    private int anomodelo;
    private int qtdportas;
    private String acessorios;       

    //metodo contrutor
    public Veiculo(int numero, String placa, String fabricante, String modelo, int anomodelo, int qtdportas, String acessorios, int idaluguel, String veiculo, Date dataaluguel, Date dataentrega, String cliente, String entregue, String observacao, Double valorpago) {
        super(idaluguel, veiculo, dataaluguel, dataentrega, cliente, entregue, observacao, valorpago);
        this.numero = numero;
        this.placa = placa;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anomodelo = anomodelo;
        this.qtdportas = qtdportas;
        this.acessorios = acessorios;
        this.veiculo = modelo;
    }
    
    //metodos getters e setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
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

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    
    
}

