import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {

        JPanel contentPanel = new JPanel();

        contentPanel.setLayout(new FlowLayout());
        contentPanel.setBackground(new Color(162, 187, 245));
        contentPanel.setOpaque(true);
        contentPanel.setPreferredSize(new Dimension(500,600));
        JLabel contributionLabel = new JLabel();


        contributionLabel.setText("Contribuição: ");


        this.setTitle("Cálculo de Poupança");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(contentPanel);
        contentPanel.add(contributionLabel);
        this.setVisible(true);
        this.pack();

    }
}
