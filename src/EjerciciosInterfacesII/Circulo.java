package EjerciciosInterfacesII;

public class Circulo implements ShapeOperable{

    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double perimetro() {

        return 2*PI*radio;
    }

    @Override
    public double area() {
        return PI*(radio*radio);
    }
}
