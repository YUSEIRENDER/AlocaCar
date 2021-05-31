package model;

import java.util.ArrayList;
import java.util.Date;

public class Aluguel 
{
    //definição de variaveis
    protected int idaluguel;
    protected Veiculo veiculo;
    protected Date dataaluguel;
    protected Date dataentrega;
    protected Cliente cliente;
    protected String entregue;
    protected String observacao;
    protected Double valorpago;
    
    //metodo construtor

    public Aluguel(int idaluguel, Veiculo veiculo, Date dataaluguel, Date dataentrega, Cliente cliente, String entregue, String observacao, Double valorpago) {
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

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
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