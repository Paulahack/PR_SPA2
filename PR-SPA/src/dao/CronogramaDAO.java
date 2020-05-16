/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import BEAN.CronogramaBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CronogramaDAO {
    public static void adicionar(CronogramaBean Cronograma) throws SQLException{
        String sql = "INSERT INTO Cronograma(Cliente, Data, Horário, Serviços, Quantidade_de_Sessões, Pagamento_Total, Forma_de_Pagamento) VALUES(?,?,?,?,?,?,?)";
        try{
            Connection conexao = CONEX_DB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
           stmt.setString(1, Cronograma.getCliente());
           stmt.setString(2, Cronograma.getData());
           stmt.setString(3, Cronograma.getHorário());
           stmt.setString(4, Cronograma.getServiços());
           stmt.setInt(5, Cronograma.getQuantidade_de_Sessões());
           stmt.setFloat(6, Cronograma.getPagamento_Total());
           stmt.setString(7, Cronograma.getForma_de_Pagamento());
           stmt.execute();
        }catch(Exception e){
            
        }
    }
     public static ArrayList<CronogramaBean> Listar() {
         ArrayList<CronogramaBean> Cronograma = new ArrayList<>();
         String sql = "SELECT * FROM Cronograma";
         
         try{
             Connection conexao = CONEX_DB.retornaConexao();
             PreparedStatement  stmt = conexao.prepareStatement(sql);
             
            ResultSet registro = stmt. executeQuery(sql);
            
            while(registro.next() ){
             CronogramaBean temporario = new CronogramaBean();
             temporario.setCliente(registro.getString("Cliente:"));
             temporario.setData(registro.getString("Data:"));
             temporario.setHorário(registro.getString("Horário"));
             temporario.setServiços(registro.getString("Serviços:"));
             temporario.setQuantidade_de_Sessões(registro.getInt("Quantidade de Sessões:"));
             temporario.setPagamento_Total(registro.getFloat("Pagamento Total:"));
             temporario.setForma_de_Pagamento(registro.getString("Forma de Pagamento"));
             Cronograma.add(temporario);
            }
            return Cronograma;
         
     }catch(Exception e){
    System.err.println("Erro na Listagem de Cronograma:"+e.toString());
    
         }
         return null;
     }

}

