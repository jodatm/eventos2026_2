package vista;

import controlador.ControladorCalculadora;
import logica.Operacion;

public interface Vista{
    public int getNumero1();
    public int getNumero2();
    public Operacion getOperacion();
    public void mostrarResultado(int resultado);
    public void iniciar(ControladorCalculadora controlador);
}