package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao 
{
    //pegar conexao com o banco de dados
    public Connection getConnection() throws SQLException
    {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/bancolocacar","root","");
            return conexao;
    }        
    
}
