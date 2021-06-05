package model;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Aluguel 
{
    //definição de variaveis
    private int idaluguel;
    private Veiculo veiculo;
    private Date dataaluguel;
    private Date dataentrega;
    private Cliente cliente;
    private String entregue;
    private String observacao;
    private Float valorpago;
    
    //metodo construtor

    
    
    //metodos gettes e setters
    public Aluguel(int idaluguel, Veiculo veiculo, String dataaluguel, String dataentrega, Cliente cliente, String entregue, String observacao, Float valorpago) {
        this.idaluguel = idaluguel;
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.entregue = entregue;
        this.observacao = observacao;
        this.valorpago = valorpago;
        //tente data
        try
        {
            
            this.dataaluguel = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(dataaluguel);
            this.dataentrega = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(dataentrega);
            
        }
        catch(ParseException ex)
        {
            
            Logger.getLogger(Aluguel.class.getName()).log(Level.SEVERE, null, ex);
            
        }            
        
    }

    public Aluguel(int idaluguel, Veiculo veiculo, String dataaluguel, String dataentrega, Cliente cliente, String entregue, Float valorpago) {
        this.idaluguel = idaluguel;
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.entregue = entregue;
        this.valorpago = valorpago;
        //tente data
        try
        {
            
            this.dataaluguel = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(dataaluguel);
            this.dataentrega = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(dataentrega);
            
            
        }
        catch(ParseException ex)
        {
            
            Logger.getLogger(Aluguel.class.getName()).log(Level.SEVERE, null, ex);
            
        }    
    }
    
    //metodos getters e setters

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

    public Float getValorpago() {
        return valorpago;
    }

    public void setValorpago(Float valorpago) {
        this.valorpago = valorpago;
    }
    
}