import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

    public MyFrame(){

        /*Flow Layout: Posiciona componentes em uma linha, dimensionados em seu tamanho de preferência.
        Se o espaço horizontal no conteiner é muito pequeno, a classe FlowLayoult utiliza a próxima linha disponível
        para posicionar o componente.*/

        JPanel contentPanel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        contentPanel.setLayout(new FlowLayout());
        contentPanel.setBackground(new Color(14, 44, 107));
        contentPanel.setOpaque(true);

        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();

        ImageIcon image1 = new ImageIcon("resources/electricity.png");
        ImageIcon image2 = new ImageIcon("resources/lava.png");
        ImageIcon image3 = new ImageIcon("resources/magic_archer.png");

        label1.setIcon(image1);
        label2.setIcon(image2);
        label3.setIcon(image3);

        label1.setText("Mago Elétrico");
        label2.setText("Lava Hound");
        label3.setText("Arqueiro Mágico");

        label1.setForeground(Color.WHITE);
        label2.setForeground(Color.WHITE);
        label3.setForeground(Color.WHITE);

        label1.setHorizontalTextPosition(SwingConstants.CENTER);
        label1.setVerticalTextPosition(SwingConstants.BOTTOM);

        label2.setHorizontalTextPosition(SwingConstants.CENTER);
        label2.setVerticalTextPosition(SwingConstants.BOTTOM);

        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);

        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(contentPanel);
        contentPanel.add(label1);
        contentPanel.add(label2);
        contentPanel.add(label3);
        this.setVisible(true);
        this.pack();
    }

}
