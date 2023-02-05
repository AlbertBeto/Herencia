package EjerciciosPolimorfismo;

public class MainPoliformismo {

    public static void main(String[] args) {

        Coche Ferrari = new Deportivo("Testarrosa",3850,320,4,2);


        Ferrari.acelerar();
        Ferrari.frenar();

        Ferrari=new Furgoneta("Fiat Ducato",2000,150,2,1,3,3500);
        System.out.println(Ferrari.getModelo());
        Ferrari.acelerar();

Ferrari = new Autocaravana("Mileo 242",2000,130,1,1,5,3500,2950);

        Ferrari.acelerar();
        Ferrari.frenar();

    }



    //class
}
