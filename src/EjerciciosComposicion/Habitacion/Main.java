package EjerciciosComposicion.Habitacion;

public class Main {


    public static void main(String[] args) {

        Techo techo = new Techo(2,3);
        Pared norte = new Pared("Norte");
        Pared sur = new Pared("Sur");
        Pared este = new Pared("Este");
        Pared oeste = new Pared("Oeste");
        Cama cama = new Cama("Tudor",4,70,3,2);
        Lampara lampara = new Lampara("Tudor",false,4);


        Habitacion invitados = new Habitacion("invitados",norte,este,sur,oeste,techo,cama,lampara);

        invitados.hacerLaCama();
        System.out.println();
        System.out.println(lampara.hayBateria());
        lampara.encender();


        //mainmain
    }



    //class
}
