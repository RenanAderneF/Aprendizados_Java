import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MyFrame extends JFrame {

    MyFrame(){

        JPanel contentPanel = new JPanel();

        contentPanel.setLayout(new GridLayout(6,5));
        contentPanel.setPreferredSize(new Dimension(300,400));

        ArrayList<JButton> buttonList = new ArrayList<>(); //Cria uma lista com os botões criados.

        for(int i =  0; i <= 9; i++){ //Definirá os botões e seus respectivos eventos com base em seu conteúdo.

            JButton btn = new JButton();
            buttonList.add(btn);
            String buttonText = btn.getText();

            System.out.println(buttonText);

        }

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(contentPanel);
        this.setVisible(true);
        this.pack();

    }

}
