package vista;

import java.util.ArrayList;
import java.util.Scanner;

import controlador.ControladorTienda;
import modelo.Producto;

public class VistaTiendaTerminal implements VistaTienda{

    double monto;
    ArrayList<Producto> listaProducto;


    public void mostrarDevuelta(double monto, ArrayList<Producto>listaCompras){
        System.out.println("La devuelta es: " + monto);
        for(Producto producto:listaCompras){
            System.out.println(producto.getNombre() + " - Cuesta: " + producto.getPrecio());
        }
    }
    
    public ArrayList<Producto> getListaProducto(){
        return listaProducto;
    }
    
    public double getMonto(){
        return monto;
    }

    public void iniciar(ControladorTienda controlador){
        System.out.println("Bienvenidos a la tienda de Rick y Morty");
        System.out.println("Que quieres comprar?");
        ArrayList<String> codigos = new ArrayList<>();

        ArrayList<Producto> inventario = controlador.getTienda().getInventario();

        for(Producto producto:inventario){
            if(!codigos.contains(producto.getCodigo())){
                System.out.println(producto.getNombre());
                System.out.println(producto.getCodigo());
                System.out.println(producto.getPrecio());
                codigos.add(producto.getCodigo());
            }
        }
        listaProducto = new ArrayList<>();
        System.out.println("Indicame que queres comprar?");
        while(true){
            Scanner scanner = new Scanner(System.in);
            String codigo = scanner.next();
            for(Producto producto : inventario){
                if(producto.getCodigo().equals(codigo)){
                    listaProducto.add(producto);
                    break;
                }
            }
            System.out.println("Quieres agregar algo mas?");
            String respuesta = scanner.next();
            if(respuesta.toLowerCase().equals("no")){
                break;
            }
        }
        System.out.println("Con cuanto vas a pagar?");
        Scanner scanner = new Scanner(System.in);
        monto = scanner.nextDouble();
        controlador.actionPerformed(null);
    }
}
