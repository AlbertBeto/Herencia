package EjerciciosInterfacesBienes;

public class Libro extends Bienes implements Imponible{

    private String autor;

    public Libro(String descripcion, double precio, String autor) {
        super(descripcion, precio);
        this.autor = autor;
    }


    protected String getAutor() {
        return autor;
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
    public double calculoImpuestos() {
        double impuestos= (super.precio*Imponible.tasaImpuestos)/100;
        return impuestos;
    }

}
