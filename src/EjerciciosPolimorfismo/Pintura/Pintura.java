package EjerciciosPolimorfismo.Pintura;

public class Pintura {

    protected double cobertura;

    public Pintura(double cobertura){
        this.cobertura=cobertura;
    }

    public double pinturaNecesaria(Forma forma){
        double cantidad=forma.area()*cobertura;
        System.out.println("Necesitas "+cantidad+" litros de pintura para cubrir " +forma.toString());
        return cantidad;
    }



    //class
}
