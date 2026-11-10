package modelo;

import java.util.ArrayList;

public class Tienda{

    private ArrayList<Producto> inventario;

    public ArrayList<Producto> getInventario() {
        return inventario;
    }

    public void addInventario(Producto producto) {
        inventario.add(producto);
    }

    public Tienda(ArrayList<Producto> inventario) {
        this.inventario = inventario;
    }

    public double compra(ArrayList <Producto> listaProducto, double monto){
        double devuelta = 0;
        double costoTotal = 0;

        for(Producto producto: listaProducto){
            costoTotal += producto.getPrecio();
        }
        if(costoTotal>monto){
            System.out.println("Estas pobre :v");
            return devuelta;
        }
        
        if(inventario.containsAll(listaProducto)){
            for(Producto producto: listaProducto){
                inventario.remove(producto);
            }
        }
        devuelta = monto - costoTotal;

        return devuelta;
    }

    
    
}