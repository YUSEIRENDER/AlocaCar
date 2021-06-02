package persistencia;

import entidades.Usuario;//importação do usuario no pacote entidades
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO 
{
    
    private final Connection conexao;
    
    //metodo construtor de conexao

    public UsuarioDAO(Connection conexao) 
    {
        this.conexao = conexao;
    }
    
    //função inserir
    public void inserir(Usuario usuario) throws SQLException//passar para a função um usuario do tipo usuario dentro de entidade, caso nao consiga joga uma sqlexception
    {
            //jogue na string sql o comando sql os valores respectivos no banco de dados
            String sql = "INSERT INTO usuario(nome,cargo,login,senha,email) values ('"+usuario.getNome()+"','"+usuario.getCargo()+"','"+usuario.getLogin()+"','"+usuario.getSenha()+"','"+usuario.getEmail()+"'); ";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            //efetua a execução no banco de dados
            stmt.execute();
            //fecha conexao do banco de dados
            conexao.close();

    }        
}
