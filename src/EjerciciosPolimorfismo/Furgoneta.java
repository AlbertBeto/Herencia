package EjerciciosPolimorfismo;

public class Furgoneta extends Coche{


    protected int velocidadMaxima;
    protected int aceleracion;
    protected int desaceleracion;
    protected int pasajeros;
    protected int pesoMaximo;

    protected int pesoActual;

    public Furgoneta(String modelo, int cilindros,int  velocidadMaxima, int aceleracion, int desaceleracion, int pasajeros, int pesoMaximo){
        super(modelo,cilindros);
        this.velocidadMaxima=velocidadMaxima;
        this.aceleracion=aceleracion;
        this.desaceleracion=desaceleracion;
        this.pasajeros=pasajeros;
        this.pesoMaximo=pesoMaximo;

    }

    @Override
    protected void acelerar(){
        System.out.println("La furgoneta "+getModelo()+" está acelerando "+aceleracion+" metros por segundo.");

    }

    @Override
    protected void frenar(){
        System.out.println("La furgoneta "+getModelo()+" está desacelerando "+desaceleracion+" metros por segundo.");

    }

protected void peso(int pesoActual, int pesoMaximo){
        if (pesoActual >= pesoMaximo){
            System.out.println("Va pasado de peso. Aligere su vehiculo.");
            System.out.println("Su peso actual es "+pesoActual);
    }else{
            System.out.println("Su peso actual es "+pesoActual);
        }


}

}
