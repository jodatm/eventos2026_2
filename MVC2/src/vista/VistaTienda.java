package vista;

import java.util.ArrayList;

import controlador.ControladorTienda;
import modelo.Producto;

public interface VistaTienda {
    public void mostrarDevuelta(double monto, ArrayList<Producto>listaCompras);
    public ArrayList<Producto> getListaProducto();
    public double getMonto();
    public void iniciar(ControladorTienda controlador);
}
