package EjerciciosAbstract;

public class TrianguloEquilatero extends Forma{

    protected double lado;
    protected double altura;

    public TrianguloEquilatero(int numLados, double lado) {
        super(numLados);
        this.lado = lado;
    }

    @Override
    protected double getArea() {
        return ((lado*lado)*Math.sqrt(3))/4;
    }

    @Override
    protected double getPerimeter() {
        return lado*3;
    }


//class
}
