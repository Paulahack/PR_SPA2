/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEWS;

import BEAN.FuncionárioBean;
import dao.FuncionárioDAO;
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
public class FormulárioFuncionário extends JPanel implements ActionListener{
    JTextField campo_Nome;
    JLabel label_Nome;
    
    JTextField campo_Numero_de_Identificação;
    JLabel label_Numero_de_Identificação;
    
    JTextField campo_Área;
    JLabel label_Área;
    
    JTextField campo_CNPJ;
    JLabel label_CNPJ;
    
    JTextField campo_Salário;
    JLabel label_Salário;
    
    JButton botao_salvar;
    
    public FormulárioFuncionário(){
        campo_Nome = new JTextField(20);
        label_Nome = new JLabel("Nome:");
        
        campo_Numero_de_Identificação = new JTextField(20);
        label_Numero_de_Identificação = new JLabel("Número de Identificação:");
        
        campo_Área = new JTextField(20);
        label_Área = new JLabel("Área de Atuação:");
        
        campo_CNPJ = new JTextField(20);
        label_CNPJ = new JLabel("CNPJ:");
        
        campo_Salário = new JTextField(20);
        label_Salário = new JLabel("Salário:");
        
        botao_salvar= new JButton ("Salvar");
        
  
        add(campo_Nome);
        add(label_Nome);
        add(campo_Numero_de_Identificação);
        add(label_Numero_de_Identificação);
        add(campo_Área);
        add(label_Área);
        add(campo_CNPJ);
        add(label_CNPJ);
        add(campo_Salário);
        add(label_Salário);
        add(botao_salvar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String nome_d = campo_Nome.getText();
       int num_d = Integer.parseInt(campo_Numero_de_Identificação.getText());
       String area_d = campo_Área.getText();
       String CNPJ_d = campo_CNPJ.getText();
        float salario_d = Float.parseFloat(campo_Salário.getText());
       
       FuncionárioBean f  = new FuncionárioBean();
       f.setNome(nome_d);
       f.setNumero_de_Identificação(num_d);
       f.setÁrea(area_d);
       f.setCNPJ(CNPJ_d);
       f.setSalário(salario_d);
        
        try {
            FuncionárioDAO.adicionar(f);
        } catch (SQLException ex) {
            Logger.getLogger(FormulárioFuncionário.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
}
