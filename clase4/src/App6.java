import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class App6 extends JFrame{
    
    Container contenedor;

    public App6(){
        contenedor = getContentPane();
        GridLayout border = new GridLayout(2,2,15,15);
        contenedor.setLayout(border);

        JButton boton = new JButton("ACEPTAR");
        contenedor.add(boton);

        JButton boton2 = new JButton("CANCELAR");
        contenedor.add(boton2);

        JButton boton3 = new JButton("SALIR");
        contenedor.add(boton3);

        JButton boton4 = new JButton("asdsadsa");
        contenedor.add(boton4);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        App6 app6 = new App6();
    }

}
