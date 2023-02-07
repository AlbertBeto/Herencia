package EjerciciosPolimorfismo.Pintura;

public class Cilindro extends Forma{

    protected double altura;
    protected double radio;
    protected double area;

    public Cilindro(double altura, double radio){
        super("Circulo");
        this.altura=altura;
        this.radio=radio;
        area=Math.PI*altura*(radio*radio);
    }
    @Override
    public double area() {
        return this.area;
    }

    @Override
    public String toString() {
        return super.toString();
    }




    //class
}
