import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener {

    JButton botao1; //botao1 é declarado globalmente para que o método "actionPerfomed" possa acessá-lo.

    public myFrame(){

        botao1 = new JButton("Clique em Mim!");
        botao1.setBounds(55,105,150,20);
        botao1.setFocusable(false);
        botao1.addActionListener(this); //Adiciona ouvinte de evento no botao1.

        JPanel contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setBounds(100,100,250,250);
        contentPane.setBackground(Color.BLUE);
        contentPane.setOpaque(true);
        contentPane.add(botao1);



        this.setLayout(null);
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(contentPane);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botao1){

            System.out.println("Botão clicado.");
        }
    }
}
