package EjercicioComposicion;

public class Main {

    public static void main(String[] args) {

        Cabeza cascoAcero = new Cabeza("Casco Acero",2,"Clasico casco de acero pulido.",1);
        Torso cueroTachonado = new Torso("Cuero tachonado",5,"Capas de cuero endurecido con remaches de metal forjado.",4);
        BrazosGuantes guantesAquero = new BrazosGuantes("Guantes de Arquero",1,"Endurecidos y reforzados en los dedos y las palmas",1);
        Piernas mallasElficas = new Piernas("Mallas elficas",2,"Paquete y tanga elfico marcado.",1);
        Botas botasMarinero = new Botas("Botas de Marinero",2,"Tallo alto en piel. Gastadas pero adaptadas",2);

        EquipoPersonaje roger = new EquipoPersonaje(cascoAcero,cueroTachonado,guantesAquero,mallasElficas,botasMarinero);

        roger.DescripcionCompletaTorso();

        roger.DescripcionCompletaCabeza();
    }


    //class
}
