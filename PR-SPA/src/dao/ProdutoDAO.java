/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import BEAN.ProdutoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ProdutoDAO {
    public static void adicionar( ProdutoBean Produto) throws SQLException{
        String sql = "INSERT INTO Produto(Produto, Quantidade, Valor_Unitário, Marca, Vendedor) VALUES(?, ?, ?, ?, ?)";
        try{
            Connection conexao = CONEX_DB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1 , Produto.getProduto());
            stmt.setInt(2, Produto.getQuantidade());
            stmt.setFloat(3, Produto.getValor_Unitário());
            stmt.setString(4, Produto.getMarca());
            stmt.setString(5, Produto.getVendedor());
            stmt.execute();
            
        }catch(Exception e){
            
        }
    }
public static ArrayList<ProdutoBean> listar(){
   ArrayList<ProdutoBean> Produto = new ArrayList<>();
   
   String sql = "SELECT * FROM Produto";
   
   try{
       Connection conexao = CONEX_DB.retornaConexao();
       PreparedStatement stmt = conexao.prepareStatement(sql);
      
       
       ResultSet registro = stmt.executeQuery(sql);
       
       while (registro.next()){
           ProdutoBean temporario = new ProdutoBean();
           temporario.setProduto(registro.getString("Produto:"));
           temporario.setQuantidade(registro.getInt("Quantidade:"));
           temporario.setValor_Unitário(registro.getFloat("Valor Unitário:"));
           temporario.setMarca(registro.getString("Marca:"));
           temporario.setVendedor(registro.getString("Vedendor:"));
           Produto.add(temporario);           
           
       }
       return Produto;
   }catch(Exception e ){
       System.err.println("Erro na Listagem de Produto:"+ e.toString());
   
   }
   return null;
}    

}
