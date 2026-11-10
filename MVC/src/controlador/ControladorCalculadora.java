package controlador;

import logica.Calculadora;
import logica.Operacion;
import vista.Vista;
import vista.VistaGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCalculadora implements ActionListener{
    
    private Calculadora calculadora;
    private Vista vista;

    public ControladorCalculadora(Calculadora calculadora, Vista vista) {
        this.calculadora = calculadora;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Operacion operacion = vista.getOperacion();

        if(vista.getClass()==VistaGUI.class){
            VistaGUI vista2 = (VistaGUI)vista;
            if(e.getSource()==vista2.sumar){
                operacion = Operacion.SUMAR;
            }else if(e.getSource()==vista2.restar){
                operacion = Operacion.RESTAR;
            }
            
        }

        
        int numero1 = vista.getNumero1();
        int numero2 = vista.getNumero2();

        calculadora.setNumero1(numero1);
        calculadora.setNumero2(numero2);

        if(operacion == Operacion.SUMAR){
            calculadora.sumar();    
        }else if(operacion == Operacion.RESTAR){
            calculadora.restar();    
        }

        
        int resultado = calculadora.getResultado();
        vista.mostrarResultado(resultado);
    }

    public void inicializacion(){
           vista.iniciar(this);
    }



}
