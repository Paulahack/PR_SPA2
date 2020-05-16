
package principal;

import Layout.CENTRO;
import Layout.DIREITA;
import Layout.ESQUERDA;
import Layout.RODAPÉ;
import Layout.TOPO;
import java.awt.BorderLayout;
import javax.swing.JFrame;


public class IniciarAplicação {
    public static CENTRO centro = new CENTRO();

    public static void main(String[] args){


        BorderLayout layout_Janela = new BorderLayout();

        JFrame Janela = new JFrame();
        Janela.setLayout(layout_Janela);
        Janela.add( new CENTRO(), BorderLayout.CENTER);
        Janela.add(new TOPO(), BorderLayout.NORTH);
        Janela.add(new RODAPÉ(), BorderLayout.SOUTH);
        Janela.add(new ESQUERDA(), BorderLayout.EAST);
        Janela.add(new DIREITA () , BorderLayout.WEST);
        Janela.pack();
        Janela.setVisible(true);
        Janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}