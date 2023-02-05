package EjerciciosPolimorfismo.Pintura;

public class Forma {
    protected String nombre;

public Forma(String nombre){
    this.nombre=nombre;
}

    protected double area(){
        return 0.0;
    }

    @Override
    public String toString() {

        return nombre;
    }

    //class
}
