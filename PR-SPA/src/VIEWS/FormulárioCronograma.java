
package VIEWS;

import BEAN.CronogramaBean;
import dao.CronogramaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FormulárioCronograma extends JPanel implements ActionListener {
   JTextField campo_Cliente;
   JLabel label_Cliente;
   
   JTextField campo_Data;
   JLabel label_Data;
   
   JTextField campo_Horário;
   JLabel label_Horário;
   
   JTextField campo_Serviços;;
   JLabel label_Serviços;
   
   JTextField campo_Quantidade_de_Sessões;
   JLabel label_Quantidade_de_Sessões;
   
   JTextField campo_Pagamento_Total;
   JLabel label_Pagamento_Total;
   
   JTextField campo_Forma_de_Pagamento;
   JLabel label_Forma_de_Pagamento;
   
   JButton botao_salvar;
   
   public FormulárioCronograma(){
   
       campo_Cliente = new JTextField(20);
       label_Cliente = new JLabel("Cliente:");
       
       campo_Data = new JTextField(20);
       label_Data = new JLabel("Data:");
       
       campo_Horário = new JTextField(20);
       label_Horário = new JLabel("Horário:");
       
       campo_Serviços = new JTextField(20);
       label_Serviços = new JLabel("Serviços:");
       
       campo_Quantidade_de_Sessões = new JTextField(20);
       label_Quantidade_de_Sessões = new JLabel("Quantidade de Sessões Feitas:");
       
       campo_Pagamento_Total = new JTextField(20);
       label_Pagamento_Total = new JLabel("Pagamento Total:");
       
       campo_Forma_de_Pagamento = new JTextField(20);
       label_Forma_de_Pagamento = new JLabel("Forma de Pagamento");
       
        botao_salvar= new JButton ("Salvar");
        
       add(campo_Cliente);
       add(label_Cliente);
       add(campo_Data);
       add(label_Data);
       add(campo_Horário);
       add(label_Horário);
       add(campo_Serviços);
       add(label_Serviços) ;     
       add(campo_Quantidade_de_Sessões);   
       add(label_Quantidade_de_Sessões);  
       add(campo_Pagamento_Total);
       add(label_Pagamento_Total);
       add(campo_Forma_de_Pagamento);
       add(label_Forma_de_Pagamento);
       add(botao_salvar);        
               
               
}

    @Override
    public void actionPerformed(ActionEvent e) {
        String cliente_d = campo_Cliente.getText();
        String data_d = campo_Data.getText();
        String horario_d = campo_Horário.getText();
        String serviços_d = campo_Serviços.getText();
        int quant_d = Integer.parseInt(campo_Quantidade_de_Sessões.getText());
        float pagT_d = Float.parseFloat(campo_Pagamento_Total.getText());
        String formpag_d = campo_Forma_de_Pagamento.getText();
        
        CronogramaBean c = new CronogramaBean();
        c.setCliente(cliente_d);
        c.setData(data_d);
        c.setHorário(horario_d);
        c.setServiços(serviços_d);
        c.setQuantidade_de_Sessões(quant_d);
        c.setPagamento_Total(pagT_d);
        c.setForma_de_Pagamento(formpag_d);
        
       try {
           CronogramaDAO.adicionar(c);
       } catch (SQLException ex) {
           Logger.getLogger(FormulárioCronograma.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}
