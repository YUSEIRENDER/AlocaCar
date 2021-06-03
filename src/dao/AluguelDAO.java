package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Aluguel;


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
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setObject(2, aluguel.getVeiculo());//statement seta string 2=? o que vir de aluguel.getVeiculo()
        stmt.setDate(3, aluguel.getDataaluguel());//statement seta string 3=? o que vir de aluguel.getDataaluguel()
        stmt.setDate(4, aluguel.getDataentrega());//statement seta  string 4=? o que vir de aluguel.getDataentrega()
        
    }        
    
}
