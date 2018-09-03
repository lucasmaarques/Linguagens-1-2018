package javasqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ItemDAO {
    private final String TABELA = "estoque";

    public boolean CreateTable(){
        Connection conexao = null;
        Statement stmt = null;
        try{
            conexao = DriverManager.getConnection("jdbc:sqlite:banco.db");
            stmt = conexao.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS " + TABELA +"(" +
                    "id INT PRIMARY_KEY NOT NULL,"
                    + "name VARCHAR(45),"
                    + "price REAL,"
                    + "count INT);";
            stmt.executeUpdate(sql);
            stmt.close();
            conexao.close();
           
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
            return false;
        }
        return true;
        
    }
    public boolean InsertItem(Item item){
        //Responsável por fazer a conexão com o banco
        Connection conexao = null;
      
        try{
            //Estabelece a conexão com o banco usando o driver
            conexao = DriverManager.getConnection("jdbc:sqlite:banco.db");
            
            conexao.setAutoCommit(false);
            
            String sql = "INSERT INTO " + TABELA + " VALUES(?,?,?,?);";
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, item.getId());
            ps.setString(2, item.getName());
            ps.setDouble(3, item.getPrice());
            ps.setInt(4, item.getCount());
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
    public ArrayList<Item> GetAll(){
        ArrayList<Item> items = new ArrayList<>();
        //Responsável por fazer a conexão com o banco
        Connection conexao = null;
        //Responsável por aplicar as queries
        Statement stmt = null;    
        try{
            //Estabelece a conexão com o banco usando o driver
            conexao = DriverManager.getConnection("jdbc:sqlite:banco.db");
            
            stmt = conexao.createStatement();
            
            String sql = "SELECT * FROM "+ TABELA +";";
            //Tabela de resposta com os dados do banco - retorno da query
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                int count = rs.getInt("count");
                double price = rs.getDouble("price");
                String name = rs.getString("name");
                items.add(new Item(id, count, name, price));
            }
            rs.close();
            stmt.close();
            conexao.close();
        }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());           
        }
        return items;
    }
     
}



