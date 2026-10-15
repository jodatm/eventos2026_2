package logica;

public class Persona <g,h>{

    private String nombre;
    private g edad;
    private h cedula;
    
    public Persona(String nombre, g edad, h cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public g getEdad() {
        return edad;
    }

    public void setEdad(g edad) {
        this.edad = edad;
    }

    public h getCedula() {
        return cedula;
    }

    public void setCedula(h cedula) {
        this.cedula = cedula;
    }

    
    
}
