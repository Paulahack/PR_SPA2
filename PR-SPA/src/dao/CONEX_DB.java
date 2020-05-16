package dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CONEX_DB{
    private static final String USUARIO = "root";
    private static final String SENHA = "123456789";
    private static final String URL_BANCO= "jdbc:mysql://127.0.0.1:3306/PR_SPA?useTimezone=true&serverTimezone=UTC";
            
   public static Connection retornaConexao() {
       Connection conexao = null;
   
   try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    conexao = DriverManager.getConnection(URL_BANCO, USUARIO, SENHA);
  
   }catch (SQLException e){
       System.err.println("ERRO DE CONEXAO:"+ e.toString());
   }catch (ClassNotFoundException e){
       System.err.println("Classe nao Encontrada:"+ e.toString());
   }
       
       
   return conexao;
       }
}



