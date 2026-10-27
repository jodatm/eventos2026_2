import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class App5 extends JFrame{
    
    Container contenedor;

    public App5(){
        contenedor = getContentPane();
        BorderLayout border = new BorderLayout(15,15);
        contenedor.setLayout(border);

        JButton boton = new JButton("ACEPTAR");
        contenedor.add(boton, BorderLayout.NORTH);

        JButton boton2 = new JButton("CANCELAR");
        contenedor.add(boton2, BorderLayout.CENTER);

        JButton boton3 = new JButton("SALIR");
        contenedor.add(boton3, BorderLayout.SOUTH);

        JButton boton4 = new JButton("asdsadsa");
        contenedor.add(boton4, BorderLayout.EAST);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        App5 app5 = new App5();
    }

}
