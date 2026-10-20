package logica;

public class Cuadrado extends FiguraGeometrica{

    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
        calcularArea();
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    protected void calcularArea(){
        int nueva_area = lado*lado;
        setArea(nueva_area);
    }

}
