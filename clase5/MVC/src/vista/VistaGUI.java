package vista;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controlador.ControladorCalculadora;
import logica.Operacion;

public class VistaGUI extends JFrame implements Vista{

    Container contenedor;
    public JButton sumar, restar;
    JTextField numero1, numero2;

    public VistaGUI(){
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());

        numero1 = new JTextField(10);
        contenedor.add(numero1);

        numero2 = new JTextField(10);
        contenedor.add(numero2);

        sumar = new JButton("SUMAR");
        contenedor.add(sumar);

        restar = new JButton("RESTAR");
        contenedor.add(restar);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
    }

    

    public int getNumero1(){
        return Integer.parseInt(numero1.getText());
    }
    
    public int getNumero2(){
        return Integer.parseInt(numero2.getText());
    }

    public void mostrarResultado(int resultado){
        JOptionPane.showMessageDialog(contenedor, "El resultado es " + resultado);
    }

    public void iniciar(ControladorCalculadora controlador){
        setVisible(true);
        sumar.addActionListener(controlador);
        restar.addActionListener(controlador);
    }



    @Override
    public Operacion getOperacion() {
        return null;
    }
}
