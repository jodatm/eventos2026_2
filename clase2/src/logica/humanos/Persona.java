package logica.humanos;

public class Persona{
    private String cedula;
    private TipoIdentificacion tipoIdentificacion;

    public Persona(String cedula, TipoIdentificacion tipoIdentificacion){
        this.cedula = cedula;
        this.tipoIdentificacion = tipoIdentificacion;
    }

    @Override 
    public String toString(){
        return "Una persona tiene " + tipoIdentificacion + " , " + cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    

}