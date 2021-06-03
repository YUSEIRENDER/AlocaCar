package model;

public class Cliente {
    
    //definição de variaveis
    private String nomecliente;
    private String endereco;
    private String uf;
    private String telefone;
    private Long cpf;
    private String email;

    //metodo construtor
    public Cliente(String nomecliente, String endereco, String uf, String telefone, Long cpf, String email) {
        this.nomecliente = nomecliente;
        this.endereco = endereco;
        this.uf = uf;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
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

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
