import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(){

        //Layout Manager: Define o layout padrão dos componentes em um conteiner.

        //Três managers comuns:

        //BorderLayout: Coloca componentes em cinco áreas: NORTH, SOUTH, WEST, EAST e CENTER.

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        //Tamanho em que objetos serão preferencialmente inicializados.
        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,200));
        panel4.setPreferredSize(new Dimension(100,200));
        panel5.setPreferredSize(new Dimension(400,100));

        this.setLayout(new BorderLayout()); //Aplica esse layout aos componentes.
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        this.add(panel1,BorderLayout.NORTH); //Painel1 é posicionado no topo da tela.
        this.add(panel2,BorderLayout.SOUTH); //Painel2 é posicionado no fundo da tela.
        this.add(panel3,BorderLayout.WEST); //Painel3 é posicionado à esquerda da tela.
        this.add(panel4,BorderLayout.EAST); //Painel4 é posicionado à direita da tela.
        this.add(panel5,BorderLayout.CENTER); //Painel5 é posicionado no centro da tela.
        this.pack();

        /*Esse layout é bem útil para organização de conteúdos. Aplicando-o no frame principal, por exemplo, poderia-se
        criar um painel localizado acima da tela para representar um cabeçalho principal*/

    }
}
