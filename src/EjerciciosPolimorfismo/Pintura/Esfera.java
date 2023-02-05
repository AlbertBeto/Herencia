package EjerciciosPolimorfismo.Pintura;

public class Esfera extends Forma{

    protected double radio;
    protected double area;

    public Esfera(double radio){
        super("Esfera");
        this.radio=radio;
        area=4*Math.PI*(radio*radio);
    }
    @Override
    public double area() {
        return this.area;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
