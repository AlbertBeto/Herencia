package EjerciciosAbstract;

public class Rectangulo extends Forma implements Redimensionable{
    public Rectangulo(int numLados, double ancho, double alto) {
        super(numLados=4);
        this.ancho = ancho;
        this.alto = alto;
    }

    protected double ancho;
    protected double alto;


    @Override
    protected double getArea() {
        return ancho*alto;
    }

    @Override
    protected double getPerimeter() {
        return 2*(ancho+alto);
    }

    @Override
    public void redimensionar(int x) {
        ancho=x;
        alto=x;

    }

    //class
}
