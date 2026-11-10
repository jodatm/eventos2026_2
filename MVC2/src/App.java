import java.util.ArrayList;

import controlador.ControladorTienda;
import modelo.Producto;
import modelo.Tienda;
import vista.VistaTiendaTerminal;

public class App {
    public static void main(String[] args) throws Exception {
        Producto arroz = new Producto("Doña Diana", 5000, "123");
        Producto cafe = new Producto("Juan Valdez", 30000, "456");
        Producto cafe2 = new Producto("Sello rojo", 5000, "678");
        Producto cafe3 = new Producto("Aguila Roja", 7000, "679");
        Producto leche = new Producto("Alpina",6000, "322");

        ArrayList<Producto> inventario = new ArrayList<>();
        inventario.add(arroz);
        //inventario.add(arroz);
        inventario.add(arroz);
        inventario.add(cafe);
        inventario.add(cafe);
        //inventario.add(cafe2);
        //inventario.add(cafe2);
        //inventario.add(cafe3);
        //inventario.add(cafe3);
        //inventario.add(cafe3);
        //inventario.add(cafe3);
        //inventario.add(cafe3);
        inventario.add(leche);
        inventario.add(leche);

        Tienda tienda = new Tienda(inventario);
        VistaTiendaTerminal vista = new VistaTiendaTerminal();
        ControladorTienda controlador = new ControladorTienda(tienda, vista);
        controlador.inicializacion();
        

    }
}
            


            