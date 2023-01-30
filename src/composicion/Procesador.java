package composicion;

public class Procesador {

    private String modelo;
    private int ramSlots;
    private int cardSlots;

    public Procesador(String modelo, int ramSlots, int cardSlots) {
        this.modelo = modelo;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }

    public void presionarBotonEncendido(){
        System.out.println("Iniciando el ordenador");
    }

    public void cargarPrograma(String programa){
        System.out.println("Abriendo "+ programa);
    }

}
