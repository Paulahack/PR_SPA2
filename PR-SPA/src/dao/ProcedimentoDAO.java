/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import BEAN.ProcedimentoBean;
import BEAN.ProdutoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory.Result;

/**
 *
 * @author Admin
 */
public class ProcedimentoDAO {
    public static void adicionar( ProcedimentoBean Procedimento) throws SQLException{
        String sql = "INSERT INTO Procedimento(Qual, Valor, Funcionário_Responsável, Produtos_Ultilizados, Tempo_de_Procedimento) VALUES (?,?,?,?,?)";
        try{
            Connection conexao = CONEX_DB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, Procedimento.getQual());
            stmt.setFloat(2, Procedimento.getValor());
            stmt.setString(3, Procedimento.getFuncionário_Responsável());
            stmt.setString(4, Procedimento.getProdutos_Ultilizados());
            stmt.setString(5, Procedimento.getTempo_de_Procedimento());
            stmt.execute();
            
        }catch(Exception e){
            
        }
    }
public static ArrayList<ProcedimentoBean> listar() throws SQLException{
   ArrayList<ProcedimentoBean> Procedimento = new ArrayList<>();
    
   String sql = "SELECT * FROM Procedimento";
   
   try{
       Connection conexao = CONEX_DB.retornaConexao();
       PreparedStatement stmt = conexao.prepareStatement(sql);
       
       ResultSet registro = stmt.executeQuery(sql);
       
       while(registro.next()){
           ProcedimentoBean temporario = new ProcedimentoBean();
          
           temporario.setQual(registro.getString("Procedimento:"));
           temporario.setValor(registro.getFloat("Valor:"));
           temporario.setFuncionário_Responsável(registro.getString("Funcionário Responsável:"));
          temporario.setProdutos_Ultilizados(registro.getString("Produtos Ultilizados:"));
          temporario.setTempo_de_Procedimento(registro.getString("Tempo de Procedimento:"));
          Procedimento.add(temporario);
       }
                   return Procedimento;
                   
       }catch (Exception e){
           System.err.println("Erro na Listagem de Procedimento:"+e.toString());
           
   }
   return null;
}
}
