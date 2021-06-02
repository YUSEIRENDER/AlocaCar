package entidades;

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
    
    //metodo super de veiculo
    public Veiculo(Veiculo veiculo)
    {
        
        super(veiculo);
        
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
    
    
}

