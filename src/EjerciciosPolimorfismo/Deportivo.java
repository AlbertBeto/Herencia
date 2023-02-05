package EjerciciosPolimorfismo;

public class Deportivo extends Coche{

    private int velocidadMaxima;
    private int aceleracion;
    private int desaceleracion;

    public Deportivo(String modelo, int cilindros,int  velocidadMaxima, int aceleracion, int desaceleracion){
        super(modelo,cilindros);
        this.velocidadMaxima=velocidadMaxima;
        this.aceleracion=aceleracion;
        this.desaceleracion=desaceleracion;

    }

@Override
protected void acelerar(){
    System.out.println("El deportivo "+super.getModelo()+" está acelerando "+aceleracion+" metros por segundo.");

}

    @Override
    protected void frenar(){
        System.out.println("El deportivo "+super.getModelo()+" está desacelerando "+desaceleracion+" metros por segundo.");

    }

}
