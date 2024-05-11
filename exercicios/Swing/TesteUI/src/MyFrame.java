import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyFrame extends JFrame { //Permite o uso de métodos de JFrame em MyFrame.

    MyFrame() { //Construtor chamado diretamente para criar uma tela.

        //Inicializa objeto para definir imagem de ícone:
        ImageIcon windowIcon = new ImageIcon("resources/icon.png");
        this.setIconImage(windowIcon.getImage());

        //Inicializando objeto JLabel para título.

        JLabel label1 = new JLabel();
        label1.setBounds(0,0,900,20); //Define posição e tamanho da componente.
        label1.setVerticalAlignment(JLabel.TOP);
        label1.setHorizontalAlignment(JLabel.CENTER);
        this.add(label1);

        label1.setText("ADICIONANDO O MÁXIMO DE COMPONENTES POSSÍVEL!");
        label1.setBackground(new Color(255,255,255)); //Define cor de fundo do componente
        label1.setOpaque(true); //Define componente como opaco para que a cor de fundo seja modificada.
        label1.setVisible(true);

        //Inicializando objeto de etiqueta. Nesse caso, label será composto de uma imagem e um texto.
        JLabel label2 = new JLabel();
        label2.setBounds(0,0,890,600);
        label2.setHorizontalAlignment(JLabel.CENTER); //Alinha label(texto + imagem) horizontalmente no centro.

        ImageIcon imageL2 = new ImageIcon("resources/palhacada.png"); //Recebe valor do caminho do arquivo.

        label2.setIcon(imageL2); //imagem é associada à label2.
        label2.setIconTextGap(30); //Define espaço entre imagem e texto.
        label2.setText("Notícia média que bomba no Twitter:"); //label tem texto definido.

        //Definindo fonte pro texto de label:
        label2.setFont(new Font("Rockwell", Font.PLAIN, 20)); //Personaliza a fonte, estilo e tamanho do
        //texto.
        label2.setForeground(new Color(255, 255, 255)); //Define a cor do componente.
        label2.setBackground(new Color(60,80,120)); //Define cor de fundo do componente
        label2.setOpaque(true); //Define componente como opaco para que a cor de fundo seja modificada.

        /*Obs: Uma label toma o maior espaço possível que conseguir na tela. Por isso, ao ter só uma label como
        componente, ela ocupa toda a janela do programa.*/

        //Definindo uma borda para o texto de label.
        Border bordaH1 = BorderFactory.createLineBorder(Color.lightGray, 5);
        label2.setBorder(bordaH1);

        //Definindo a posição do texto.
        label2.setHorizontalTextPosition(JLabel.LEFT); //Posição horizontal do texto em relação à imagem.
        label2.setVerticalTextPosition(JLabel.TOP); //Posição vertical do texto em relação à imagem.

        this.add(label2); //Adiciona label2 ao objeto criado com o construtor MyFrame(), que corresponde à tela.

        //Métodos referentes à própria janela (instância de JFrame).
        //this.setSize(900,900); //Define tamanho da tela.
        this.setResizable(true);
        this.setTitle("Teste de Interface Gráfica com Swing");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fechar o app faz com que o programa pare de executar.
        //this.setLayout(null); //Isso faz com que os componentes precisem ser posicionados manualmente.
        this.setVisible(true);
        this.pack();

    }

}
