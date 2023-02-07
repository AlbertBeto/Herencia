package EjerciciosPolimorfismo;

public abstract class Coche {
    protected String modelo;
    protected boolean motor=true;
    protected int ruedas=4;
    protected int cilindros;


    public Coche(String modelo, int cilindros){
        this.modelo=modelo;
        this.cilindros=cilindros;
    }


    protected String getModelo() {
        return modelo;
    }

    protected boolean isMotor() {
        return motor;
    }

    protected int getRuedas() {
        return ruedas;
    }

    protected int getCilindros() {
        return cilindros;
    }

    protected void arrancar(){
        System.out.println("El "+modelo+" ha sido arrancado.");
    }

    protected void acelerar(){
        System.out.println("El vehiculo está acelerando.");
    }

    protected void frenar(){
        System.out.println("El vehiculo está frenando.");
    }



    //class
}

