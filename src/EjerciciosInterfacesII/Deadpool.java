package EjerciciosInterfacesII;

public class Deadpool extends Persona implements SuperHeroe{

    protected String superPoder;

    public Deadpool(String nombre, int edad, String superPoder) {
        super(nombre, edad);
        this.superPoder = superPoder;
    }

    @Override
    public void activarSuperPoder() {
        System.out.println(superPoder+" Activado.");
    }

    @Override
    public void desactivarSuperPoder() {
        System.out.println(superPoder+" Desactivado.");
    }


}
