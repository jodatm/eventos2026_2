package logica2;

public class Caballo extends Transporte implements Animal{

    String raza;
    String nombre;
    static final public int numeroPatas=4;
    static public int numeroCaballos;

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Caballo(int numeroPasajeros, String numeroLicencia, String raza, String nombre) {
        super(numeroPasajeros, numeroLicencia);
        this.raza = raza;
        this.nombre = nombre;
        numeroCaballos++;
    }
    @Override
    public void reproduccion() {
        System.out.println("????");
    }
    @Override
    public void dormir() {
        System.out.println("sentado");
    }

    public static void comoSeRienLosCaballo(){
        System.out.println("jijijijijijijijijijijiji");
    }
    
}
