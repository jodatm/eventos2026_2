package logica2;

public class Perro implements Animal{
    
    String pedigree;

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public Perro(String pedigree) {
        this.pedigree = pedigree;
    }

    @Override
    public void reproduccion() {
        System.out.println("jajajajaja");
    }

    @Override
    public void dormir() {
        System.out.println("echados");
    }

    

}
