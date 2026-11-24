import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Prueba{

    Stack <Integer> pila;
    

    public static void main(String[] args) {
        Stack <Integer> pila = new Stack<Integer>();
        pila.push(5);
        pila.push(2);
        pila.push(7);
        System.out.println(pila.pop());    

        Queue cola = new LinkedList<>();
        cola.add(1);
        cola.add(2);
        cola.add(3);
        System.out.println(cola.poll());

        Set <Integer> conjunto = new HashSet<Integer>();
        conjunto.add(1);
        conjunto.add(1);
        System.out.println(conjunto.toString());

        HashMap <String,String> directorio = new HashMap<>();
        directorio.put("1234", "joshua");
        directorio.put("5678", "maria");
        System.out.println(directorio.get("1234"));
    }
}