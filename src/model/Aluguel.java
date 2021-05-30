package model;

import java.util.ArrayList;
import java.util.Date;

public class Aluguel 
{
    //definição de variaveis
    protected int idaluguel;
    protected String veiculo;
    protected Date dataaluguel;
    protected Date dataentrega;
    protected String cliente;
    protected String entregue;
    protected String observacao;
    protected Double valorpago;
    
    //metodo construtor
    public Aluguel(int idaluguel, String veiculo, Date dataaluguel, Date dataentrega, String cliente, String entregue, String observacao, Double valorpago) {
        this.idaluguel = idaluguel;
        this.veiculo = veiculo;
        this.dataaluguel = dataaluguel;
        this.dataentrega = dataentrega;
        this.cliente = cliente;
        this.entregue = entregue;
        this.observacao = observacao;
        this.valorpago = valorpago;
    }

    
    //metodos gettes e setters
    public int getIdaluguel() {
        return idaluguel;
    }

    public void setIdaluguel(int idaluguel) {
        this.idaluguel = idaluguel;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public Date getDataaluguel() {
        return dataaluguel;
    }

    public void setDataaluguel(Date dataaluguel) {
        this.dataaluguel = dataaluguel;
    }

    public Date getDataentrega() {
        return dataentrega;
    }

    public void setDataentrega(Date dataentrega) {
        this.dataentrega = dataentrega;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEntregue() {
        return entregue;
    }

    public void setEntregue(String entregue) {
        this.entregue = entregue;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Double getValorpago() {
        return valorpago;
    }

    public void setValorpago(Double valorpago) {
        this.valorpago = valorpago;
    }

}