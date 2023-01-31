package Polimorfismo;

public class Spiderman  extends Pelicula {

    public Spiderman() {
        super("Spiderman");
    }

    @Override
    public void trama() {
        System.out.println("Un hombre que le pica una araña.");
    }
}
