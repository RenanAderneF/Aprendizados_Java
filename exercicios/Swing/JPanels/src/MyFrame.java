import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

   public MyFrame(){

       //UTILIZANDO JPANEL:

       JPanel panel1 = new JPanel();
       panel1.setBackground(Color.RED);
       panel1.setBounds(0,0,250,250);
       JLabel label1 = new JLabel();
       label1.setText("Vermelho");
       label1.setBounds(0,0,250,250);
       label1.setVisible(true);
       label1.setFont(new Font("Comic Sans MS",Font.PLAIN,20));

       JPanel panel2 = new JPanel();
       panel2.setBackground(Color.GREEN);
       panel2.setBounds(250,0,250,250);
       JLabel label2 = new JLabel();
       label2.setText("Verde");
       label2.setVisible(true);
       label2.setFont(new Font("Comic Sans MS",Font.PLAIN,20));

       JPanel panel3 = new JPanel();
       panel3.setBackground(Color.BLUE);
       panel3.setBounds(0,250,250,250);
       JLabel label3 = new JLabel();
       label3.setText("Azul");
       label3.setVisible(true);
       label3.setFont(new Font("Comic Sans MS",Font.PLAIN,20));

       JPanel panel4 = new JPanel();
       panel4.setBackground(Color.YELLOW);
       panel4.setBounds(250,250,250,250);
       JLabel label4 = new JLabel();
       label4.setText("Amarelo");
       label4.setVisible(true);
       label4.setFont(new Font("Comic Sans MS",Font.PLAIN,20));

       //Janela JFrame:

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.add(panel1);
        panel1.add(label1);
        this.add(panel2);
        panel2.add(label2);
        this.add(panel3);
        panel3.add(label3);
        this.add(panel4);
        panel4.add(label4);
        this.setSize(750,750);
        //this.pack();

   }
}
