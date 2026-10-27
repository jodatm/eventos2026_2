import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class App7 extends JFrame{
    
    Container contenedor;

    public App7(){
        contenedor = getContentPane();
        BorderLayout border = new BorderLayout(15,15);
        contenedor.setLayout(border);

        JPanel matrix = new JPanel();
        matrix.setLayout(new GridLayout(2,2));

        JButton boton = new JButton("1");
        matrix.add(boton);

        JButton boton2 = new JButton("2");
        matrix.add(boton2);

        JButton boton3 = new JButton("3");
        matrix.add(boton3);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1,3));

        JButton boton4 = new JButton("7");
        panel2.add(boton4);

        JButton boton5 = new JButton("8");
        panel2.add(boton5);

        JButton boton6 = new JButton("9");
        panel2.add(boton6);

        matrix.add(panel2);

        contenedor.add(matrix, BorderLayout.CENTER);

        JLabel etiqueta2 = new JLabel("Pokemon");
        contenedor.add(etiqueta2, BorderLayout.NORTH);

        JLabel etiqueta3 = new JLabel("DIGIMON");
        contenedor.add(etiqueta3, BorderLayout.NORTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        App7 app7 = new App7();
    }

}
