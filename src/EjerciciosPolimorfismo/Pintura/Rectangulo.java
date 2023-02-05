package EjerciciosPolimorfismo.Pintura;

public class Rectangulo extends Forma{

    protected double longitud;
    protected double ancho;
    protected double area;

    public Rectangulo(double longitud, double ancho){
        super("Rectangulo");
        this.longitud=longitud;
        this.ancho=ancho;
        area=longitud*ancho;
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
