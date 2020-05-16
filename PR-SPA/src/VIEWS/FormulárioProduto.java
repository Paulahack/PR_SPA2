
package VIEWS;

import BEAN.ProdutoBean;
import dao.ProdutoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FormulárioProduto extends JPanel implements ActionListener{
    JTextField campo_Produto;
    JLabel label_Produto;
    
    JTextField campo_Quantidade;
    JLabel label_Quantidade;
    
    JTextField campo_Valor_Unitário;
    JLabel label_Valor_Unitário;
    
    JTextField campo_Marca;
    JLabel label_Marca;
    
    JTextField campo_Vendedor;
    JLabel label_Vendedor;
    
     JButton botao_salvar;
    
    public FormulárioProduto(){
        
        campo_Produto = new JTextField(20);
        label_Produto = new JLabel("Produto:");
        
        campo_Quantidade = new JTextField(20);
        label_Quantidade = new JLabel("Quantidade:");
        
        campo_Valor_Unitário = new JTextField(20);
        label_Valor_Unitário = new JLabel("Valor Unitário:");
        
        campo_Marca = new JTextField (20);
        label_Marca =new JLabel ("Marca:");
        
        campo_Vendedor = new JTextField(20);
        label_Vendedor = new JLabel ("Vendedor:");
        
        botao_salvar= new JButton ("Salvar");
        
        
         add(campo_Produto);
         add(label_Produto);
         add(campo_Quantidade);
         add(label_Quantidade);
         add(campo_Valor_Unitário);       
         add(label_Valor_Unitário );
         add(campo_Marca);
         add(label_Marca);
         add(campo_Vendedor);
         add(label_Vendedor );
         add(botao_salvar);

        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String produto_d = campo_Produto.getText();
        int quanti_d = Integer.parseInt(campo_Quantidade.getText());
        float val_d = Float.parseFloat(campo_Valor_Unitário.getText());
        String marca_d = campo_Marca.getText();
        String vend_d = campo_Vendedor.getText();
        
        ProdutoBean p = new ProdutoBean();
        
        p.setProduto(produto_d);
        p.setQuantidade(quanti_d);
        p.setValor_Unitário(val_d);
        p.setMarca(marca_d);
        p.setVendedor(vend_d);
        
        try {
            ProdutoDAO.adicionar(p);
        } catch (SQLException ex) {
            Logger.getLogger(FormulárioProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
