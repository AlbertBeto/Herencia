package EjercicioComposicion;

public class Torso {

    private String nombre;
    private int proteccionFisica;
    private String descripcion;
    private int resistenciaGolpes;

    public Torso(String nombre, int proteccionFisica, String descripcion, int resistenciaGolpes) {
        this.nombre = nombre;
        this.proteccionFisica = proteccionFisica;
        this.descripcion = descripcion;
        this.resistenciaGolpes = resistenciaGolpes;
    }



    public void descripcionCompleta(){

        System.out.println("Nombre: "+getNombre()+" Descripción: "+getDescripcion());
    }


    private String getNombre() {
        return nombre;
    }

    private int getProteccionFisica() {
        return proteccionFisica;
    }

    private String getDescripcion() {
        return descripcion;
    }

    private int getResistenciaGolpes() {
        return resistenciaGolpes;
    }
}
