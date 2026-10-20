package logica2;

public class Carro extends Transporte{

    int numeroLlantas;

    public Carro(int numeroPasajeros, String numeroLicencia, int numeroLlantas) {
        super(numeroPasajeros, numeroLicencia);
        this.numeroLlantas = numeroLlantas;
    }
    
}
