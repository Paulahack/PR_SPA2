
package VIEWS;

import BEAN.ProcedimentoBean;
import dao.ProcedimentoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormulárioProcedimento extends JPanel implements ActionListener {
    
    JTextField campo_Qual;
    JLabel label_Qual;
    
    JTextField campo_Valor;
    JLabel label_Valor;
    
    JTextField campo_Funcionário_Responsável;
    JLabel label_Funcionário_Responsável;
    
    JTextField campo_Produtos_Ultilizados;
    JLabel label_Produtos_Ultilizados;
    
    JTextField campo_Tempo_de_Procedimento;
    JLabel label_Tempo_de_Procedimento;
    
    JButton botao_salvar;
    
    public FormulárioProcedimento(){
        
        campo_Qual = new JTextField(20);
        label_Qual = new JLabel("Procedimento:");
        
        campo_Valor = new JTextField(20);
        label_Valor = new JLabel("Valor:");
        
        campo_Funcionário_Responsável = new JTextField(20);
        label_Funcionário_Responsável = new JLabel("Funcionário Responsável:");
        
        campo_Produtos_Ultilizados = new JTextField(20);
        label_Produtos_Ultilizados = new JLabel("Produtos Ultilizados:");
        
        campo_Tempo_de_Procedimento = new JTextField(20);
        label_Tempo_de_Procedimento = new JLabel("Duração do Procedimento:");
        
         botao_salvar= new JButton ("Salvar");
         
         
        add( campo_Qual);
        add(label_Qual);        
        add(campo_Valor); 
        add(label_Valor);
        add(campo_Funcionário_Responsável);        
        add(label_Funcionário_Responsável) ;       
        add( campo_Produtos_Ultilizados)  ;      
        add( label_Produtos_Ultilizados)   ;     
        add(campo_Tempo_de_Procedimento)   ;
        add(label_Tempo_de_Procedimento);
        add(botao_salvar);      
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String qual_d = campo_Qual.getText();
        float valor_d = Float.parseFloat(campo_Valor.getText());
        String funcR_d = campo_Funcionário_Responsável.getText();
        String Prod_d = campo_Produtos_Ultilizados.getText();
        String temp_d = campo_Tempo_de_Procedimento.getText();
        
        ProcedimentoBean pro = new ProcedimentoBean();
        
        pro.setQual(qual_d);
        pro.setValor(valor_d);
        pro.setFuncionário_Responsável(funcR_d);
        pro.setProdutos_Ultilizados(Prod_d);
        pro.setTempo_de_Procedimento(temp_d);
        
        try {
            ProcedimentoDAO.adicionar(pro);
        } catch (SQLException ex) {
            Logger.getLogger(FormulárioProcedimento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
