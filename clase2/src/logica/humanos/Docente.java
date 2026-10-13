package logica.humanos;

public class Docente extends Persona{

    private short numeroPublicaciones;
    private String tituloMasAlto;
    private boolean tenured;

    public Docente(short numeroPublicaciones, String tituloMasAlto, 
        boolean tenured, String cedula, TipoIdentificacion tipo) {
        super(cedula, tipo);
        this.numeroPublicaciones = numeroPublicaciones;
        this.tituloMasAlto = tituloMasAlto;
        this.tenured = tenured;
    }

    public short getNumeroPublicaciones() {
        return numeroPublicaciones;
    }

    public void setNumeroPublicaciones(short numeroPublicaciones) {
        this.numeroPublicaciones = numeroPublicaciones;
    }

    public String getTituloMasAlto() {
        return tituloMasAlto;
    }

    public void setTituloMasAlto(String tituloMasAlto) {
        this.tituloMasAlto = tituloMasAlto;
    }

    public boolean isTenured() {
        return tenured;
    }

    public void setTenured(boolean tenured) {
        this.tenured = tenured;
    } 

    @Override 
    public String toString(){
        return super.toString() + "y lo del docente es " + numeroPublicaciones + " y nombrado?" + tenured;
    }
    
}
