package logica;

public abstract class FiguraGeometrica {
    private double area;

    public double getArea() {
        return area;
    }

    protected void setArea(double area) {
        this.area = area;
    }

    public FiguraGeometrica() {
        
    }

    protected abstract void calcularArea();
}
