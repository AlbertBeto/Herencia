package EjercicioComposicion;

public class Piernas {
    private String nombre;
    private int proteccionFisica;
    private String descripcion;
    private int resistenciaGolpes;

    public Piernas(String nombre, int proteccionFisica, String descripcion, int resistenciaGolpes) {
        this.nombre = nombre;
        this.proteccionFisica = proteccionFisica;
        this.descripcion = descripcion;
        this.resistenciaGolpes = resistenciaGolpes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getProteccionFisica() {
        return proteccionFisica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getResistenciaGolpes() {
        return resistenciaGolpes;
    }
}
