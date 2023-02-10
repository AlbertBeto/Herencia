package EjerciciosAbstract;

public abstract class Forma {

    protected int numLados;

    public Forma(int numLados) {
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    protected abstract double getArea();

    protected abstract double getPerimeter();


}
