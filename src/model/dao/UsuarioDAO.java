package model.dao;

import model.Usuario;//importação do usuario no pacote entidades
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioDAO 
{
    
    private final Connection conexao;
    
    //metodo construtor de conexao

    public UsuarioDAO(Connection conexao) 
    {
        this.conexao = conexao;
    }

    public UsuarioDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //função inserir
    public void inserir(Usuario usuario) throws SQLException//passar para a função um usuario do tipo usuario dentro de entidade, caso nao consiga joga uma sqlexception
    {
            //jogue na string sql o comando sql os valores respectivos no banco de dados
            String sql = "INSERT INTO usuario(nome,cargo,login,senha,email) values (?,?,?,?,?); ";//cria string sql
            PreparedStatement stmt = null;
            
            try
            {
                stmt = conexao.prepareStatement(sql);
                
                stmt.setString(1,usuario.getNome());//statement seta string 1=? o que vir de usuario.getNome()
                stmt.setString(2,usuario.getCargo());//statement seta string 2=? o que vir de usuario.getCargo()
                stmt.setString(3,usuario.getLogin());//statement seta string 3=? o que vir de usuario.getLogin()
                stmt.setString(4,usuario.getSenha());//statement seta string 4=? o que vir de usuario.getSenha()
                stmt.setString(5, usuario.getEmail());//statement seta string 5=? o que vir de usuario.getEmail()
            
                //efetua a execução no banco de dados
                stmt.execute();        
                JOptionPane.showMessageDialog(null, "Usuario inserido com sucesso!");
            }
            catch(SQLException ex)
            {
                
                JOptionPane.showMessageDialog(null, "Erro ao inserir no banco de dados!");
                
            }
            finally
            {
                
                stmt.close();
                conexao.close();
                
            }    

    }               
    //função excluir
    public void deletar(Usuario usuario) throws SQLException
    {
        
        try
        {
            
            String sql = "DELETE FROM usuario WHERE nome = ?";//cria string sql
            PreparedStatement stmt = conexao.prepareStatement(sql);
        
            stmt.setString(1, usuario.getNome());//statement seta string 1=? o que vir de usuario.getNome()
            stmt.execute();//efetua a execução no banco de dados            
            JOptionPane.showMessageDialog(null, "Usuario deletado com sucesso!");
        }
        catch(SQLException ex)
        {
            
            JOptionPane.showMessageDialog(null, "Erro ao deletar usuario!");
            
        }
        finally
        {
            
            conexao.close();
            
        }    
        
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
            
            String nome = resultSet.getString("nome");
            String cargo = resultSet.getString("cargo");
            String login = resultSet.getString("login");
            String senha = resultSet.getString("senha");
            String email = resultSet.getString("email");         
            
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
    
    public List<Usuario> ler() throws SQLException
    {
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try 
        {
            String sql = "SELECT * FROM usuario ";//cria string sql
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = null;
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                
                Usuario usuario = new Usuario();
                
                usuario.setNome(rs.getString("nome"));
                usuario.setCargo(rs.getString("cargo"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setEmail(rs.getString("email"));
                
                usuarios.add(usuario);
                
            }    
        } catch (SQLException ex) 
        {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            
            conexao.close();
            
        }    
        
        return usuarios;
    }        
    
}
