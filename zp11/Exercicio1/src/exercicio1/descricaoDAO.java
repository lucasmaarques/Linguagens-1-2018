
package exercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class descricaoDAO {
    private final String TABELA = "animais";
    public boolean CreateTable(){
        Connection conexao = null;
        Statement stmt = null;
        try{
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/meudb","root","");
            conexao.setAutoCommit(false);
            stmt = conexao.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS " + TABELA +"("
                    + "id INT,"
                    + "nome VARCHAR(45),"
                    + "altura INT,"
                    + "peso INT);";
            stmt.executeUpdate(sql);
            conexao.commit();
            stmt.close();
            conexao.close();
           
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
            return false;
        }
        return true;
        
    }
    public boolean InsertItem(descricao descricao){
        //Responsável por fazer a conexão com o banco
        Connection conexao = null;
      
        try{
            //Estabelece a conexão com o banco usando o driver
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/meudb","root","");
            
            conexao.setAutoCommit(false);
            
            String sql = "INSERT INTO " + TABELA + " VALUES(?,?,?,?);";
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, descricao.getId());
            ps.setString(2, descricao.getNome());
            ps.setInt(3, descricao.getAltura());
            ps.setInt(4, descricao.getPeso());
            ps.executeUpdate();
            
            conexao.commit();
            conexao.close();
        }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());
            return false;
        }
        return true;
    }  
    public ArrayList<descricao> GetAll(){
        ArrayList<descricao> descricao = new ArrayList<>();
        //Responsável por fazer a conexão com o banco
        Connection conexao = null;
        //Responsável por aplicar as queries
        Statement stmt = null;    
        try{
            //Estabelece a conexão com o banco usando o driver
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/meudb","root","");
            
            stmt = conexao.createStatement();
            
            String sql = "SELECT * FROM "+ TABELA +";";
            //Tabela de resposta com os dados do banco - retorno da query
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int altura = rs.getInt("altura");
                int peso = rs.getInt("peso");
                descricao.add(new descricao(id,nome, altura, peso));
            }
            rs.close();
            stmt.close();
            conexao.close();
        }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());           
        }
        return descricao;
    }
    public void AtualizaDados(descricao descricao){
        //Responsável por fazer a conexão com o banco
        Connection conexao = null;
      
        try{
            //Estabelece a conexão com o banco usando o driver
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/meudb","root","");
            
            conexao.setAutoCommit(false);
            
            String sql = "UPDATE " + TABELA + " SET nome = ?,"
                    + " altura = ?, peso = ?, id = ? WHERE nome = ?;";
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(4,descricao.getId());
            ps.setString(1, descricao.getNome());
            ps.setInt(2, descricao.getAltura());
            ps.setInt(3, descricao.getPeso());
            ps.setString(5, descricao.getNome());
            
            
            ps.executeUpdate();
            
            conexao.commit();
            conexao.close();
        }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());            
        }
    }
    public void ZeraTable(){
        Connection conexao = null;
        Statement stmt = null;
        try{
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/meudb","root","");
            stmt = conexao.createStatement();
            conexao.setAutoCommit(false);
            String sql = "DELETE FROM " + TABELA + ";";
            stmt.executeUpdate(sql);
            conexao.commit();
            stmt.close();
            conexao.close();
           
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
          
        }
        
        
    }
    
    
}
