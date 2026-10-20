import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

public class App extends JFrame implements ActionListener, ItemListener{

    static Container contenedor;
    JLabel etiqueta1, etiqueta2, etiqueta3;
    JTextField campo;
    JTextArea area;
    JPasswordField password;
    JButton boton1, boton2;
    FlowLayout layout;
    JCheckBox check1, check2, check3;
    JRadioButton radio1, radio2, radio3;
    JComboBox <String> combo;
    String colores [] = {"rojo", "azul", "amarillo", "casi"};

    public App(){
        contenedor = getContentPane();
        layout = new FlowLayout();
        contenedor.setLayout(layout);

        contenedor.setBackground(Color.RED);

        etiqueta1 = new JLabel("eventos!!!!");
        contenedor.add(etiqueta1);

        etiqueta2 = new JLabel("goooooooooooooooooooooooooooool!");
        etiqueta2.setFont(new Font("arial",Font.ITALIC,30));
        etiqueta2.setForeground(new Color(247,225,175));
        contenedor.add(etiqueta2);

        //Icon icono = new ImageIcon("media\\cyber.jpg");
        //etiqueta3 = new JLabel(icono);
        //contenedor.add(etiqueta3);

        campo = new JTextField(10);
        contenedor.add(campo);

        password = new JPasswordField(10);
        contenedor.add(password);

        boton1 = new JButton("calcular");
        boton1.addActionListener(this);
        contenedor.add(boton1);

        boton2 = new JButton("restar");
        boton2.addActionListener(this);
        contenedor.add(boton2);

        
        area = new JTextArea(5,15);
        JScrollPane panel = new JScrollPane(area);
        contenedor.add(panel);

        check1 = new JCheckBox("pikachu");
        check1.addItemListener(this);
        contenedor.add(check1);
        
        check2 = new JCheckBox("charizard");
        check2.addItemListener(this);
        contenedor.add(check2);

        check3 = new JCheckBox("mewtwo");
        check3.addItemListener(this);
        contenedor.add(check3);

        ButtonGroup grupo = new ButtonGroup();

        radio1 = new JRadioButton("Soltero");
        grupo.add(radio1);
        contenedor.add(radio1);

        radio2 = new JRadioButton("Casado");
        grupo.add(radio2);
        contenedor.add(radio2);

        radio3 = new JRadioButton("Viudo");
        grupo.add(radio3);
        contenedor.add(radio3);

        combo = new JComboBox<String>(colores);
        combo.addItemListener(this);
        contenedor.add(combo);

        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public static void main(String[] args) throws Exception {
        App app = new App();
        //JOptionPane.showMessageDialog(contenedor, "hola");
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton1){
            int edad = Integer.parseInt(campo.getText());
            edad /= 2;
            JOptionPane.showMessageDialog(contenedor, "tu edad sobre 2 es " + edad);
            campo.setText("");
        }else if(e.getSource()==boton2){
            JOptionPane.showMessageDialog(contenedor, "vamos a restar");
        }
    }

    public void itemStateChanged(ItemEvent e){
        
        if(e.getSource()==combo){
            if(e.getStateChange()==ItemEvent.SELECTED){
                System.out.println(combo.getSelectedItem());
            }
        }else{
            boolean validacion_check1 = check1.isSelected();
            boolean validacion_check2 = check2.isSelected();
            boolean validacion_check3 = check3.isSelected();

            String seleccionados = "Los pokemon seleccionados son: ";
            if(validacion_check1){
                seleccionados += "pikachu ";
            }
            if(validacion_check2)
                seleccionados += "charizar ";
            if(validacion_check3)
                seleccionados += "mewtwo ";

            System.out.println(seleccionados);
        }
        
    }
}
