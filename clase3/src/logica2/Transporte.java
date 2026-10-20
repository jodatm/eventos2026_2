package logica2;

public class Transporte {

    private int numeroPasajeros;
    private String numeroLicencia;
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }
    public String getNumeroLicencia() {
        return numeroLicencia;
    }
    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
    public Transporte(int numeroPasajeros, String numeroLicencia) {
        this.numeroPasajeros = numeroPasajeros;
        this.numeroLicencia = numeroLicencia;
    }
    
    

}
