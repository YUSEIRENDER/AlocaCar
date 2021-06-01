package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Veiculo;//importação do veiculo no pacote entidades

public class VeiculoDAO {
    
    private final Connection conexao;
    
    //metodo construtor de conexao
    public VeiculoDAO(Connection conexao)
    {
        
        this.conexao = conexao;
        
    }
    
    //função inserir
    public void inserir(Veiculo veiculo) throws SQLException//passar para a função um cliente do tipo cliente dentro de entidade, caso nao consiga joga uma sqlexception
    {
        
        //jogue na string sql o comando sql os valores respectivos no banco de dados
        String sql = "INSERT INTO veiculo(numero,placa,fabricante,modelo,anomodelo,qtdportas,acessorios) values (?,?,?,?,?,?,?); ";//cria string sql
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setString(1,veiculo.getNumero());//statement seta string 1=? o que vir de veiculo.getNumero()
        stmt.setString(2, veiculo.getPlaca());//statement seta string 1=? o que vir de veiculo.getPlaca()
        stmt.setString(3, veiculo.getFabricante());//statement seta string 1=? o que vir de veiculo.getFabricante()
        stmt.setString(4, veiculo.getModelo());//statement seta string 1=? o que vir de veiculo.getModelo()
        stmt.setInt(5, veiculo.getAnomodelo());//statement seta string 1=? o que vir de veiculo.getAnoModelo()
        stmt.setInt(6, veiculo.getQtdportas());//statement seta string 1=? o que vir de veiculo.getQtdportas()
        stmt.setString(7, veiculo.getAcessorios());//statement seta string 1=? o que vir de veiculo.getAcessorios()
        
        //efetua a execução no banco de dados
        stmt.execute();
        
    }
    
    //função deletar
    public void deletar(Veiculo veiculo) throws SQLException
    {
        
        String sql = "DELETE FROM veiculo WHERE placa = ?";//cria string sql
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setString(1, veiculo.getPlaca());//statement seta string 1=? o que vir de veiculo.getPlaca()
        stmt.execute();//efetua a execução no banco de dados
        
    }
    
    //função selecionar tudo
    public ArrayList<Veiculo> selecioneTudo() throws SQLException//tras lista de veiculo
    {
        
        String sql = "SELECT * FROM veiculo";//cria string sql
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        return pesquisa(stmt);//pesquisa o statement
        
    }
    
    //metodo pesquisa abstraido
    private ArrayList<Veiculo> pesquisa(PreparedStatement stmt) throws SQLException {//cria função pesquisa, recebe o statement e retorna lista de veiculo
        
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();//crie um arraylist de veiculo
        
        stmt.execute();//efetua a execução no banco de dados
        //traga o resultado
        ResultSet resultSet = stmt.getResultSet();
        
        while(resultSet.next())//enquanto estiver lendo linhas
        {
            
            String numero = resultSet.getString("numero");//o que vir de resultset.getString("numero");
            String placa = resultSet.getString("placa");//o que vir de resultset.getString("placa");
            String fabricante = resultSet.getString("fabricante");//o que vir de resultset.getString("fabricante");
            String modelo = resultSet.getString("modelo");//o que vir de resultset.getString("modelo");
            int anomodelo = resultSet.getInt("anomodelo");//o que vir de resultset.getString("anomodelo");
            int qtdporta = resultSet.getInt("qtdporta");//o que vir de resultset.getString("qtdporta");
            String acessorios = resultSet.getString("acessorios");//o que vir de resultset.getString("acessorios");
            
            Veiculo veiculocomBancoDados = new Veiculo(numero, placa, fabricante, modelo, anomodelo, qtdporta, acessorios);
            veiculos.add(veiculocomBancoDados);
        }    
        return veiculos;
    }
    
    //selecionar por placa
    public Veiculo selectporPlaca(Veiculo veiculo) throws SQLException//selecionar usuario por veiculo
    {
        
        String sql = "SELECT * FROM  veiculo WHERE placa = ?";//cria string sql
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setString(2, veiculo.getPlaca());//statement seta string 2=? o que vir de cliente.getPlaca();
        
        return pesquisa(stmt).get(2);//chama metodo pesquisa que retorna lista de veiculos e pegue o primeiro na lista de veiculos
        
    }        
}
