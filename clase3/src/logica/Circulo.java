package logica;

public class Circulo extends FiguraGeometrica{

    int diametro;

    public Circulo(int diametro) {
        this.diametro = diametro;
        calcularArea();
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
        calcularArea();
    }

    @Override
    protected void calcularArea() {
        double nueva_area = diametro * diametro * Math.PI;
        setArea(nueva_area);
    }
    
    

}
