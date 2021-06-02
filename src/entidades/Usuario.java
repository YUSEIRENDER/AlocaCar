package entidades;

public class Usuario {

    //definição de variaveis
    private String nome;
    private String cargo;
    private String login;
    private String senha;
    private String email;

    //método construtor
    public Usuario(String nome, String cargo, String login, String senha, String email) {
        this.nome = nome;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
        this.email = email;
    }
    
    
    //métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

}
