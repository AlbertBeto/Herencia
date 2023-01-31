package Polimorfismo;

public class Shrek extends Pelicula {

    public Shrek() {
        super("Shrek");
    }

    @Override
    public void trama() {
        System.out.println("Trata de la historia de un ogro...");
    }
}
