/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import BEAN.FuncionárioBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class FuncionárioDAO {
    public static void adicionar( FuncionárioBean Funcionário) throws SQLException{
        String sql = "INSERT INTO Funcionário(Nome, Numero_de_ Identificação, Área, CNPJ, Salário) VALUES (?, ?, ?, ?, ?)";
        try{
            Connection conexao = CONEX_DB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, Funcionário.getNome());
            stmt.setInt(2, Funcionário.getNumero_de_Identificação());
            stmt.setString(3, Funcionário.getÁrea());
            stmt.setString(4, Funcionário.getCNPJ());
            stmt.setFloat(5, Funcionário.getSalário());
            stmt.execute();
        }catch (Exception e){
    }
}
public static ArrayList<FuncionárioBean> listar() throws SQLException{
    ArrayList<FuncionárioBean> Funcionário = new ArrayList<>();
    String sql = "SELECT * FROM Funcionário";
    try{
        Connection conexao = CONEX_DB.retornaConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        ResultSet registro = stmt.executeQuery(sql);
        
        while (registro.next()){
           FuncionárioBean temporario = new FuncionárioBean();
           temporario.setNome(registro.getString("Nome:"));
           temporario.setNumero_de_Identificação(registro.getInt("Número de Identificação:"));
           temporario.setÁrea(registro.getString("Área:"));
           temporario.setCNPJ(registro.getString("CNPJ"));
           temporario.setSalário(registro.getFloat("Salário:"));
           Funcionário.add (temporario);
        }
        return Funcionário;
    }catch(Exception e ){
        System.err.println("Erro na Listagem de Funcionário"+e.toString()); 
    
}
    return null;
}
}