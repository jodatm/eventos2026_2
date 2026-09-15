import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int a = 5;
        int c = 5;
        Integer b = 3;
        System.out.println("hola mundo");
        Prueba pruebita = new Prueba();
        pruebita.getEdad();
        String [] lista1 = new String[2];
        lista1[0]="hola";
        lista1[1]="adios";
        System.out.println(Arrays.toString(lista1));
        int j = 5;
        /*for(int i =0; i < lista1.length;i++,j--)
        {
            System.out.println(lista1[i]);
        }*/

        /*for(String palabra : lista1){
            System.out.println(palabra);
        }

        int []numeros = {1,2,3};
        for(int numero : numeros){
            String temporal = String.valueOf(numero)+1;
            System.out.println(temporal+50);
            System.out.println(numero+1);
        }

        int hora = 4;
        System.out.println(hora++);
        System.out.println(hora);
        
        byte edadMia = 70;
        int cedula = 1234564;
        double estatura = 1.80;
        int resultado = edadMia + cedula;
        double resultado2 = Double.valueOf(edadMia) + estatura;
        System.out.println(resultado);
        System.out.println(resultado2);
        */
       System.out.println((int) (Math.random()*10) );
    }

}

