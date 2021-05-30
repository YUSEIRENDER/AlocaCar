package model;

import java.util.Date;

public class Cliente extends Aluguel{
    
    //definição de variaveis
    private String nomecliente;
    private String endereco;
    private String uf;
    private String telefone;
    private Integer cpf;
    private String email;

    //metodo construtor

    public Cliente(String nomecliente, String endereco, String uf, String telefone, Integer cpf, String email, int idaluguel, String veiculo, Date dataaluguel, Date dataentrega, String cliente, String entregue, String observacao, Double valorpago) {
        super(idaluguel, veiculo, dataaluguel, dataentrega, cliente, entregue, observacao, valorpago);
        this.nomecliente = nomecliente;
        this.endereco = endereco;
        this.uf = uf;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.nomecliente = cliente;
    }
    
    //metodos getters e setters

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

}
