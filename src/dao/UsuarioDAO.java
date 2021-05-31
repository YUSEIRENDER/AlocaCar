package dao;

import model.Usuario;//importação do usuario no pacote entidades
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO 
{
    
    private final Connection conexao;
    
    //metodo construtor de conexao

    public UsuarioDAO(Connection conexao) 
    {
        this.conexao = conexao;
    }
    
    //função inserir
    public Usuario inserir(Usuario usuario) throws SQLException//passar para a função um usuario do tipo usuario dentro de entidade, caso nao consiga joga uma sqlexception
    {
            //jogue na string sql o comando sql os valores respectivos no banco de dados
            String sql = "INSERT INTO usuario(nome,cargo,login,senha,email) values (?,?,?,?,?); ";//cria string sql
            PreparedStatement stmt = conexao.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1,usuario.getNome());//statement seta string 1=? o que vir de usuario.getNome()
            stmt.setString(2,usuario.getCargo());//statement seta string 2=? o que vir de usuario.getCargo()
            stmt.setString(3,usuario.getLogin());//statement seta string 3=? o que vir de usuario.getLogin()
            stmt.setString(4,usuario.getSenha());//statement seta string 4=? o que vir de usuario.getSenha()
            stmt.setString(5, usuario.getEmail());//statement seta string 5=? o que vir de usuario.getEmail()
            
            //efetua a execução no banco de dados
            stmt.executeUpdate();
            
                    ResultSet resultSet = stmt.getGeneratedKeys();
                          
             if (resultSet.next()) 
             {
                    String nome = resultSet.getString("nome");
                    usuario.setNome(nome);
             }

             return usuario;
             
    }               
    
    //função atualizar
    public void atualizar(Usuario usuario) throws SQLException //passar para a função um usuario do tipo usuario dentro de entidade, caso nao consiga joga uma sqlexception
    {
        
        String sql = "UPDATE usuario SET nome = ?, cargo = ?, login = ?, senha = ?, email = ? where login = ? ";//cria string sql
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setString(1, usuario.getNome());//statement seta string 1=? o que vir de usuario.getNome()
        stmt.setString(2, usuario.getCargo());//statement seta string 2=? o que vir de usuario.getCargo()
        stmt.setString(3, usuario.getLogin());//statement seta string 3=? o que vir de usuario.getLogin()
        stmt.setString(4, usuario.getSenha());//statement seta string 4=? o que vir de usuario.getSenha()
        stmt.setString(5, usuario.getEmail());//statement seta string 5=? o que vir de usuario.getEmail()
        
        stmt.execute();//efetua a execução no banco de dados
        
    }
    
    //função excluir
    public void deletar(Usuario usuario) throws SQLException
    {
        
        String sql = "DELETE FROM usuario WHERE login = ?";//cria string sql
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setString(1, usuario.getLogin());//statement seta string 1=? o que vir de usuario.getLogin()
        stmt.execute();//efetua a execução no banco de dados
        
    }       
    
    //função selecionar tudo
    public ArrayList<Usuario> selecioneTudo() throws SQLException//tras lista de usuario
    {
        
        String sql = "SELECT * FROM usuario";//cria string sql
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        return pesquisa(stmt);//pesquisa o statement
        
    }        

    //metodo pesquisa abstraido
    private ArrayList<Usuario> pesquisa(PreparedStatement stmt) throws SQLException {//cria função pesquisa, recebe o statement e retorna lista de usuario
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();//crie um arraylist de usuario
        
        stmt.execute();//efetua a execução no banco de dados
        //traga o resultado
        ResultSet resultSet = stmt.getResultSet();
        
        while(resultSet.next())//enquanto estiver lendo linhas
        {
            
            String nome = resultSet.getString("nome");//o que vir de resultset.getString("nome");
            String cargo = resultSet.getString("cargo");//o que vir de resultset.getString("cargo");
            String login = resultSet.getString("login");//o que vir de resultset.getString("login");
            String senha = resultSet.getString("senha");//o que vir de resultset.getString("senha");
            String email = resultSet.getString("email");//o que vir de resultset.getString("email");         
            
            Usuario usuariocomBancoDados = new Usuario(nome, cargo, login, senha, email);
            usuarios.add(usuariocomBancoDados);
            
        }
        
        return usuarios;
    }        
    
    public Usuario selectporNome(Usuario usuario) throws SQLException//selecionar usuario por nome
    {
        
        String sql = "SELECT * FROM  usuario WHERE nome = ?";//cria string sql
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, usuario.getNome());//statement seta string 1=? o que vir de usuario.getNome();
        
         return pesquisa(stmt).get(0);//chama metodo pesquisa que retorna lista de usuarios e pegue o primeiro na lista de usuarios

    }        
    
    //autenticar por usuario e senha
    public boolean existeUsuarioeSenha(Usuario usuario) throws SQLException 
    {
        
        String sql = "SELECT * FROM usuario WHERE login = ? and senha = ? ";//cria string sql
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setString(1, usuario.getLogin());//statement seta string 1=? o que vir de usuario.getLogin()
        stmt.setString(2, usuario.getSenha());//statement seta string 2=? o que vir de usuario.getSenha()
        
        stmt.execute();//efetua a execução no banco de dados
        
        //trazer resposta
        ResultSet resultSet = stmt.getResultSet();
        
        return resultSet.next();//enquanto o resultset tiver uma proxima linha
        
    }
    
    //função inserirouatualizar
    public void inserirOuAtualizar(Usuario usuario) throws SQLException//passar para a função um usuario do tipo usuario dentro de entidade, caso nao consiga joga uma sqlexception
    {
        
        if(usuario.getLogin() != null)//se tiver login no banco apenas atualize
        {
        
            atualizar(usuario);
        
        }
        else//se não tiver login no banco, insira no banco
        {
            
            inserir(usuario);
            
        }    
    }     

}
