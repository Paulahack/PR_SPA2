/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import BEAN.ClienteBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ClienteDAO {
    public static void adicionar (ClienteBean Cliente) throws SQLException{
    String sql = "INSERT INTO Cliente(Nome, Idade, Endereço, CPF, Data_de_Nascimento) VALUES (?, ?, ?, ?, ?) ";
    try{
        Connection conexao = CONEX_DB.retornaConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql);
           stmt.setString(1,  Cliente.getNome());
           stmt.setInt(2, Cliente.getIdade());
           stmt.setString(3, Cliente.getEndereço());
           stmt.setString(4, Cliente.getCPF());
           stmt.setString(5, Cliente.getData_de_Nascimento());
           stmt.execute();
    }catch (Exception e){
    
    }
    
}
    public static ArrayList<ClienteBean> listar(){
        ArrayList<ClienteBean> Cliente = new ArrayList<>();
        
        String sql = "SELECT * FROM Cliente";
        
        try{
            Connection conexao = CONEX_DB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
             
            ResultSet  registro = stmt.executeQuery(sql);
             
             while(registro.next()){
                 ClienteBean temporario = new ClienteBean();
                 temporario.setNome(registro.getString("Nome:"));
                 temporario.setIdade(registro.getInt("Idade:"));
                 temporario.setEndereço(registro.getString("Endereço:"));
                 temporario.setCPF(registro.getString("CPF:"));
                 temporario.setData_de_Nascimento(registro.getString("Data de Nacimento:"));
                 Cliente.add(temporario);
                 
             
        }
             return Cliente;
    
        }
    
catch(Exception e){
    System.err.println("Erro na Listagem de Clientes:"+e.toString());
    
}
return null;
    }
}
