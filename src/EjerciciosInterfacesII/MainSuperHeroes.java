package EjerciciosInterfacesII;

public class MainSuperHeroes {

    public static void main(String[] args) {


        Batman batman = new Batman("Wayne", 36, "Millonario");
        Deadpool deadpool = new Deadpool("Wayne", 26, "UltraRegeneración");

        System.out.println(deadpool.nombre+" "+deadpool.superPoder);
        deadpool.activarSuperPoder();
deadpool.desactivarSuperPoder();

        System.out.println(batman.nombre+" "+batman.superPoder);
        batman.activarSuperPoder();

    }
}
