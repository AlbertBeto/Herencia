package EjerciciosInterfacesBienes;

public class Juguete extends Bienes implements Imponible{

    protected int edadMinima;

    public Juguete(String descripcion, double precio, int edadMinima) {
        super(descripcion, precio);
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "Juguete{" +
                "edadMinima=" + edadMinima +
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
