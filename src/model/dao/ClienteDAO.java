package model.dao;

import model.Cliente;//importação do cliente no pacote entidades
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO 
{
    
    private final Connection conexao;
    
    //metodo construtor de conexao
    
    public ClienteDAO(Connection conexao)
    {
        
        this.conexao = conexao;
        
    }
    
    //função inserir
    public void inserir(Cliente cliente) throws SQLException//passar para a função um cliente do tipo cliente dentro de entidade, caso nao consiga joga uma sqlexception
    {
        
            //jogue na string sql o comando sql os valores respectivos no banco de dados
            String sql = "INSERT INTO cliente(nomecliente,endereco,uf,telefone,cpf,email) values (?,?,?,?,?,?); ";//cria string sql
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1,cliente.getNomecliente());//statement seta string 1=? o que vir de cliente.getNomecliente()
            stmt.setString(2,cliente.getEndereco());//statement seta string 2=? o que vir de cliente.getEndereco()
            stmt.setString(3,cliente.getUf());//statement seta string 3=? o que vir de cliente.getUf().
            stmt.setString(4,cliente.getTelefone());//statement seta string 4=? o que vir de cliente.getTelefone()
            stmt.setLong(5, cliente.getCpf());//statement seta string 5=? o que vir de cliente.getCpf()
            stmt.setString(6, cliente.getEmail());//statement seta string 6=? o que vier de cliente.getEmail()
            
            //efetua a execução no banco de dados
            stmt.execute();
    }        

    //função excluir
    public void deletar(Cliente cliente) throws SQLException
    {
        
        String sql = "DELETE FROM cliente WHERE cpf = ?";//cria string sql
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setLong(1, cliente.getCpf());//statement seta string 1=? o que vir de cliente.getCpf()
        stmt.execute();//efetua a execução no banco de dados
        
    }
    
    //função selecionar tudo
    public ArrayList<Cliente> selecioneTudo() throws SQLException//tras lista de cliente
    {
        
        String sql = "SELECT * FROM cliente";//cria string sql
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        return pesquisa(stmt);//pesquisa o statement
        
    }
    
    //metodo pesquisa abstraido
    private ArrayList<Cliente> pesquisa(PreparedStatement stmt) throws SQLException {//cria função pesquisa, recebe o statement e retorna lista de cliente
        
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();//crie um arraylist de cliente
        
        stmt.execute();//efetua a execução no banco de dados
        //traga o resultado
        ResultSet resultSet = stmt.getResultSet();
        
        while(resultSet.next())//enquanto estiver lendo linhas
        {
            
            String nomecliente = resultSet.getString("nomecliente");//o que vir de resultset.getString("nomecliente");
            String endereco = resultSet.getString("endereco");//o que vir de resultset.getString("endereco");
            String uf = resultSet.getString("uf");//o que vir de resultset.getString("uf");
            String telefone = resultSet.getString("telefone");//o que vir de resultset.getString("telefone");
            Long cpf = resultSet.getLong("cpf");//o que vir de resultset.getString("cpf");       
            String email = resultSet.getString("email");//o que vier de resultset.getString("email")
            
            Cliente clientecomBancoDados = new Cliente(nomecliente, endereco, uf, telefone, cpf, email);
            clientes.add(clientecomBancoDados);            
            
        }
        
        return clientes;
    }
    //selecionar por cpf
    public Cliente selectporNome(Cliente cliente) throws SQLException//selecionar usuario por cpf
    {
        
        String sql = "SELECT * FROM  cliente WHERE cpf = ?";//cria string sql
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setLong(1, cliente.getCpf());//statement seta string 1=? o que vir de cliente.getCpf();
        
        return pesquisa(stmt).get(0);//chama metodo pesquisa que retorna lista de clientes e pegue o primeiro na lista de clientes
        
    }
   
}
