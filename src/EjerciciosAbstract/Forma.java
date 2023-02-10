package EjerciciosAbstract;

public abstract class Forma {

    protected int numLados;

    public Forma(int numLados) {
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }

    protected abstract double getArea();

    protected abstract double getPerimeter();


}
