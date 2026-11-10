package controlador;

import javax.swing.Action;

import modelo.Producto;
import modelo.Tienda;
import vista.VistaTienda;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ControladorTienda implements ActionListener {

    private Tienda tienda;
    private VistaTienda vista;
    public Tienda getTienda() {
        return tienda;
    }
    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }
    public VistaTienda getVista() {
        return vista;
    }
    public void setVista(VistaTienda vista) {
        this.vista = vista;
    }
    public ControladorTienda(Tienda tienda, VistaTienda vista) {
        this.tienda = tienda;
        this.vista = vista;
    }

    public void inicializacion(){
        vista.iniciar(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        double montoCliente = vista.getMonto();
        ArrayList<Producto> listaProductos = vista.getListaProducto();
        double devuelta = tienda.compra(listaProductos, montoCliente);
        vista.mostrarDevuelta(devuelta, listaProductos);
    }
    
}
