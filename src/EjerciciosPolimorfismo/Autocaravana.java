package EjerciciosPolimorfismo;

public class Autocaravana extends Furgoneta{

  protected int pesoEnVacio;


    public Autocaravana(String modelo, int cilindros,int  velocidadMaxima, int aceleracion, int desaceleracion, int pasajeros, int pesoMaximo, int pesoEnVacio ){
        super(modelo,cilindros,velocidadMaxima,aceleracion,desaceleracion,pasajeros,pesoMaximo);
       this.pesoEnVacio=pesoEnVacio;

    }

    @Override
    protected void acelerar(){
        System.out.println("La autocaravana "+getModelo()+" está acelerando "+aceleracion+" metros por segundo.");

    }

    @Override
    protected void frenar(){
        System.out.println("La autocaravana "+getModelo()+" está desacelerando "+desaceleracion+" metros por segundo.");

    }

    @Override
    protected void peso(int pesoActual, int pesoMaximo){
        if (pesoActual >= pesoMaximo){
            System.out.println("Va pasado de peso. Aligere su autocaravana.");
            System.out.println("El peso actual de su autocaravana es "+pesoActual);
        }else{
            System.out.println("El peso actual de su autocaravana es "+pesoActual);
        }


    }





    //class
}
