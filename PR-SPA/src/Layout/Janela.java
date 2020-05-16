
package Layout;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Janela extends JFrame {
  BorderLayout Layout_Janela = new BorderLayout();
  
  public Janela(){
      setLayout(Layout_Janela);
      add(new CENTRO(), BorderLayout.CENTER);
      add(new RODAPÉ(), BorderLayout.SOUTH);
      add(new TOPO(),BorderLayout.NORTH);
      add(new ESQUERDA(),BorderLayout.EAST);
      add(new DIREITA(),BorderLayout.WEST);
        show();
    }
    
}
