package EjerciciosInterfacesBienes;

public class Libro extends Bienes implements Imponible{

    protected String autor;

    public Libro(String descripcion, double precio, String autor) {
        super(descripcion, precio);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public double calculoImpuestos(double tasaImpuestos, double precio) {
        double impuestos= (precio*tasaImpuestos)/100;
        return impuestos;
    }

}
