package EjerciciosInterfacesII;

public class Cuadrado implements ShapeOperable{

    protected double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return 4*lado;
    }

    @Override
    public double area() {
        return lado*lado;
    }

    //class
}
