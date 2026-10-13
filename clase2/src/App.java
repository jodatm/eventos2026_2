import java.util.Scanner;

import javax.swing.JOptionPane;

import logica.humanos.Administrativo;
import logica.humanos.Docente;
import logica.humanos.Persona;
import logica.humanos.TipoIdentificacion;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Object coso = new Object();
        coso = "hola";
        coso = 3;
        coso = 4.5f;
        coso = 'c';
        Object [] lista = new Object[5];
        lista[0] = 1;
        lista[1] = 2.2;
        lista[2] = "hola";
        lista[3] = 'c';
        //JOptionPane.showMessageDialog(null,"Hola");
        //Persona joker = new Persona();
        Persona batman = new Persona("1234",TipoIdentificacion.TI);
        //lista[4] = joker;
        //System.out.println(joker);
        Scanner scanner = new Scanner(System.in);
        System.out.println("vamos a crear una persona");
        System.out.println("ingresa la cedula:");
        String cedula = scanner.nextLine();
        System.out.println("ingresa el tipo de idenfiticacion:");
        TipoIdentificacion tipoIdentificacion = TipoIdentificacion.valueOf(scanner.nextLine());
        System.out.println("Los datos que ingresaste fueron:");
        System.out.println(cedula);
        System.out.println(tipoIdentificacion);
        Persona personita = new Persona(cedula,tipoIdentificacion);
        personita.setCedula("344545");
        System.out.println(personita);
        Docente docente = new Docente((short)5,"maestria",false,"4789",TipoIdentificacion.PS);
        System.out.println(docente.toString());
        docente.getCedula();
        docente.getTipoIdentificacion();

        Persona p1 = new Persona("1221",TipoIdentificacion.TI);
        Persona p2 = new Docente((short)2, "doctor", false,"234",TipoIdentificacion.PS);
        //Docente d1 = new Persona("234",TipoIdentificacion.PS);
        Administrativo a1 = new Administrativo("234", TipoIdentificacion.CE, 500000);

        Persona lista2 [] = new Persona[5];
        lista2[0] = p1;
        lista2[1] = p2;
        lista2[2] = a1;
        lista2[3] = docente;
        lista2[4] = personita;

        for(Persona p:lista2){
            System.out.println("la persona " + p.getTipoIdentificacion() + p.getCedula());
            if(p.getClass().equals(Docente.class)){
                Docente temporal = (Docente) p;
                System.out.println(temporal.getNumeroPublicaciones());
            }
            if(p.getClass().equals(Administrativo.class)){
                Administrativo temporal = (Administrativo) p;
                System.out.println(temporal.getSalario());
            }
        }
    }
}