import controlador.ControladorCalculadora;
import logica.Calculadora;
import vista.VistaGUI;
import vista.VistaTerminal;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();
        //VistaTerminal vista = new VistaTerminal();
        VistaGUI vista = new VistaGUI();
        ControladorCalculadora controlador = new ControladorCalculadora(calculadora, vista);
        controlador.inicializacion();
    }
}
