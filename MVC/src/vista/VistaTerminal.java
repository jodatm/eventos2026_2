package vista;

import java.util.Scanner;

import controlador.ControladorCalculadora;
import logica.Operacion;

public class VistaTerminal implements Vista{

    int numero1, numero2;
    Operacion operacion;

    public int getNumero1(){
        return numero1;
    }
    public int getNumero2(){
        return numero2;
    }
    public void mostrarResultado(int resultado){
        System.out.println("El resultado es " + resultado);
    }

    public void iniciar(ControladorCalculadora controlador){
        System.out.println("Bienvenidos a la calculadora!");
        System.out.println("presiona 1 para sumar");
        System.out.println("presiona 2 para restar");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        if(opcion == 1){
            operacion = Operacion.SUMAR;
        } else if(opcion == 2){
            operacion = Operacion.RESTAR;
        }

        System.out.println("dame el numero 1");
        numero1 = scanner.nextInt();
        System.out.println("dame el numero 2");
        numero2 = scanner.nextInt();
        controlador.actionPerformed(null);

        
    }

    public Operacion getOperacion(){
        return operacion;
    }
}