package EjerciciosComposicion;

public class Lampara {

    private String estilo;
    private boolean bateria;
    private int clasificacion;


    public Lampara(String estilo, boolean bateria, int clasificacion) {
        this.estilo = estilo;
        this.bateria = bateria;
        this.clasificacion = clasificacion;
    }

    public void encender(){
        System.out.println("La lampara se ha encendido.");
    }

    public String getEstilo() {
        return estilo;
    }

    public boolean hayBateria() {
        return bateria;
    }


    public int getClasificacion() {
        return clasificacion;
    }



    //class
}
