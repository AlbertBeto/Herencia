package EjerciciosInterfacesII;

public class TrianguloEquilatero implements ShapeOperable{

    protected double lado;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return 3*lado;
    }

    @Override
    public double area() {
        return ((lado*lado)*Math.sqrt(3.0))/4;
    }
    //class
}
