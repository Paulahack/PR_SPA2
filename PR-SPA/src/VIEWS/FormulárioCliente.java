/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEWS;

import BEAN.ClienteBean;
import dao.ClienteDAO;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class FormulárioCliente extends JPanel implements ActionListener {
    JTextField campo_Nome;
    JLabel label_Nome;
    
    JTextField campo_Idade;
    JLabel label_Idade;
    
    JTextField campo_Endereço;
    JLabel label_Endereço;
    
    JTextField campo_CPF;
    JLabel label_CPF;
            
    JTextField campo_Data_de_Nascimento;
    JLabel label_Data_de_Nascimento;
    
    JButton botao_salvar;
    
    public FormulárioCliente(){
        campo_Nome = new JTextField(20);
        label_Nome = new JLabel("Nome:");
        
        campo_Idade = new JTextField(20);
        label_Idade = new JLabel("Idade:");
        
        campo_Endereço = new JTextField(20);
        label_Endereço = new JLabel("Endereço:");
        
        campo_CPF = new JTextField(20);
        label_CPF = new JLabel ("CPF:");
        
        campo_Data_de_Nascimento = new JTextField(20);
        label_Data_de_Nascimento = new JLabel ("Data de Nascimento:");
        
        add(campo_Nome);
        add(label_Nome);
        add(campo_Idade);
        add(label_Idade);
        add(campo_Endereço);
        add(label_Endereço);
        add(campo_CPF);
        add(label_CPF);
        add(campo_Data_de_Nascimento);
        add(label_Data_de_Nascimento);
        add(botao_salvar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      String nome_d = campo_Nome.getText();
        int idade_d = Integer.parseInt(campo_Idade.getText() );
      String endereço_d = campo_Endereço.getText();
      String  cpf_d = campo_CPF.getText();
      String DDN_d = campo_Data_de_Nascimento.getText();
      
      ClienteBean c = new ClienteBean();
      c.setNome(nome_d);
      c.setIdade(idade_d);
      c.setEndereço(endereço_d);
      c.setCPF(cpf_d);
      c.setData_de_Nascimento(DDN_d);
      
        try {
            ClienteDAO.adicionar (c);
        } catch (SQLException ex) {
            Logger.getLogger(FormulárioCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
