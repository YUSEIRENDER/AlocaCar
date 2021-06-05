package model.dao;

import java.sql.Connection;//importação do cliente no pacote entidades
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Aluguel;
import model.Cliente;
import model.Veiculo;

public class AluguelDAO {
    
    private final Connection conexao;
    
    //metodo construtor de conexao
    
    public AluguelDAO(Connection conexao)
    {
        
        this.conexao = conexao;
        
    }
    
    //função inserir
    public void inserir(Aluguel aluguel) throws SQLException//passar para a função um aluguel do tipo aluguel dentro de entidade, caso nao consiga joga uma sqlexception
    {
 
         //jogue na string sql o comando sql os valores respectivos no banco de dados
        String sql = "INSERT INTO aluguel(idaluguel,veiculo,dataaluguel,dataentrega,cliente,entregue,observacao,valorpago) values (?,?,?,?,?,?,?,?); ";//cria string sql  
        PreparedStatement stmt = null;
        
        try
        {
             
        stmt = conexao.prepareStatement(sql);
        
        stmt.setInt(1, aluguel.getIdaluguel());
        stmt.setObject(2, aluguel.getVeiculo().getModelo());//statement seta object 2=? o que vir de aluguel.getVeiculo().getModelo()
        stmt.setDate(3, (Date) aluguel.getDataaluguel());//statement seta string 3=? o que vir de aluguel.getDataaluguel()
        stmt.setDate(4, (Date) aluguel.getDataentrega());//statement seta  string 4=? o que vir de aluguel.getDataentrega()
        stmt.setObject(5, aluguel.getCliente().getNomecliente());//statement seta object 5=? o que vier de aluguel.getcliente().getNomecliente()
        stmt.setString(6, aluguel.getEntregue());//statement seta  string 6=? o que vir de aluguel.getEntregue()
        stmt.setString(7, aluguel.getObservacao());//statement seta  string 7=? o que vir de aluguel.getObservacao()
        stmt.setDouble(8, aluguel.getValorpago());//statement seta string 8=? oq ue vir de aluguel.getValorpago()
        
        stmt.execute();            
            
        }    
        catch(SQLException ex)
        {
            
            JOptionPane.showMessageDialog(null, "Erro ao inserir no banco de dados!");
            
        }
        finally
        {
            
            stmt.close();
            
            
        }    
    }
    
    //funcao deletar
    public void deletar (Aluguel aluguel) throws SQLException
    {
        
        String sql = "DELETE FROM aluguel WHERE idaluguel = ?";//cria string sql
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setInt(1, aluguel.getIdaluguel());//statement seta string 1=? o que vir de aluguel.getIdaluguel()
        
    }
    
    //função selecionar tudo
     public ArrayList<Aluguel> selecioneTudo() throws SQLException//tras lista de aluguel
     {
         
         String sql = "SELECT * FROM aluguel";//cria string sql
         PreparedStatement stmt = conexao.prepareStatement(sql);
         
         return pesquisa(stmt);//pesquisa o statement
     }
     
     //metodo pesquisa abstraido
     private ArrayList<Aluguel> pesquisa(PreparedStatement stmt) throws SQLException //cria função pesquisa, recebe o statement e retorna lista de aluguel
     {
         
         ArrayList<Aluguel> alugeis = new ArrayList<Aluguel>();//crie um arraylist de aluguel
         
         stmt.execute();//efetua a execução no banco de dados
         //traga o resultado
         ResultSet resultSet = stmt.getResultSet();
         
         while(resultSet.next())//enquanto estiver lendo linhas
         {
             
             int idaluguel = resultSet.getInt("idaluguel");//o que vir de resultset.getInt("idaluguel");
             Veiculo veiculo = (Veiculo) resultSet.getObject("veiculo");//o que vir de resultSet.getObject("veiculo");
             String dataaluguel = resultSet.getString("dataaluguel");//o que vir de resultSet.getString("dataaluguel");
             String dataentrega = resultSet.getString("dataentrega");//o que vir de resultSet.getString("dataentrega");
             Cliente cliente = (Cliente) resultSet.getObject("cliente");//o que vir de resultSet.getObject("cliente");
             String entregue = resultSet.getString("entregue");//o que vir de resultSet.getString("entregue");
             String observacao = resultSet.getString("observacao");//o que vir de resultSet.getString("observacao");
             Float valorpago = resultSet.getFloat("observacao");//o que vir de resultSet.getFloat("observacao");
             
             Aluguel aluguelcombancodedados = new Aluguel(idaluguel, veiculo, dataaluguel, dataentrega, cliente, entregue, observacao, valorpago);
             alugeis.add(aluguelcombancodedados);
             
         }
         
         return alugeis;
     }
     
     //selecionar por id
     public Aluguel selectporId(Aluguel aluguel) throws SQLException//selecionar aluguel por id
     {
         
         String sql = "SELECT * FROM  aluguel WHERE id = ?";//cria string sql
         PreparedStatement stmt = conexao.prepareStatement(sql);
         
         stmt.setInt(1, aluguel.getIdaluguel());//statement seta string 1=? o que vir de aluguel.getIdaluguel();
         
         return pesquisa(stmt).get(0);//chama metodo pesquisa que retorna lista de alugueis e pegue o primeiro na lista de alugueis
     }        
}
