package EjerciciosInterfacesBienes;

public class Juguete extends Bienes implements Imponible{

    protected int edadMinima;

    public Juguete(String descripcion, double precio, int edadMinima) {
        super(descripcion, precio);
        this.edadMinima = edadMinima;
    }

    @Override
    public double calculoImpuestos() {
        double impuestos= (precio*Imponible.tasaImpuestos)/100;
        return impuestos;
    }

    @Override
    public String toString() {
        return "Juguete{" +
                "edadMinima=" + edadMinima +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }


}
