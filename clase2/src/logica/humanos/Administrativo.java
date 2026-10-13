package logica.humanos;

public class Administrativo extends Persona {

    private int salario;

    public Administrativo(String cedula, TipoIdentificacion tipoIdentificacion, int salario) {
        super(cedula, tipoIdentificacion);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    
    
}
