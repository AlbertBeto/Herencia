package EjerciciosInterfacesBienes;

public class Comida extends Bienes{

    protected double calorias;

    @Override
    public String toString() {
        return "Comida{" +
                "calorias=" + calorias +
                '}';
    }

    public Comida(String descripcion, double precio, double calorias) {
        super(descripcion, precio);
        this.calorias = calorias;
    }
}
