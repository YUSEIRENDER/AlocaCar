package entidades;

import java.util.ArrayList;
import java.util.Date;

public class Aluguel 
{
    //definição de variaveis
    private int idaluguel;
    private Veiculo veiculo;
    private ArrayList<Veiculo> veiculos;
    private Date dataaluguel;
    private Date dataentrega;
    private String cliente;
    private String entregue;
    private String observacao;
    private Double valorpago;
    
    //método se referindo a veiculo
    public Aluguel(Veiculo veiculo)
    {
        
        this.veiculo = veiculo;
        
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

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
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