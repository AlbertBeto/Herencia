package EjercicioComposicion;

public class Main {

    public static void main(String[] args) {

        EquipoPersonaje Roger = new EquipoPersonaje(new Cabeza("Casco Acero",2,"Clasico casco de acero pulido.",1),new Torso("Cuero tachonado",5,"Capas de cuero endurecido con remaches de metal forjado.",4),new BrazosGuantes("Guantes de Arquero",1,"Endurecidos y reforzados en los dedos y las palmas",1),new Piernas("Mallas elficas",2,"Paquete y tanga elfico marcado.",1),new Botas("Botas de Marinero",2,"Tallo alto en piel. Gastadas pero adaptadas",2));

        System.out.println(Roger.getProteccionFisicaCompleta());


    }


    //class
}
