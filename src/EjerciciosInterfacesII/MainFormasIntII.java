package EjerciciosInterfacesII;

import javax.lang.model.type.NoType;
import javax.xml.stream.events.Characters;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainFormasIntII {

    public static void main(String[] args) {

        String formaEscogida="";
        int entrada=0;
        double parametro=0;
        Scanner sc = new Scanner(System.in);
        /** Primer Menu para escoger la forma.
         *
         */
        System.out.println("Escoge una forma:");
        System.out.println("1: Circulo");
        System.out.println("2: Cuadrado");
        System.out.println("3: Triangulo Equilátero");
        /**
         * Creo un try catch alrededor del scanner por si se introduce texto. Más abajo regulo si se introduce un valor fuera de opciones.
         */
        try {
            entrada = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Ha introducido un valor erróneo");
            System.exit(0);
        }
/**
 * Entrada de la variable parámetro
 */
        System.out.println("Introduce el parámetro");
        try {
        parametro=sc.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Ha introducido un valor erróneo");
            System.exit(0);
        }
        /**
         * Creo la variable de objeto con el que tener el objeto final con el mismo nombre para todas las opciones y poder llamar variables.
         * Polimorfismo no de un padre habitual sino de una interfaz.
         */
        ShapeOperable forma2 = null;

        /**
         * Switch que trabaja con la selección del usuario y crea el objeto correspondiente a la forma con el mismo nombre para todas las opciones.
         * La mejor opción habría sido crear dos switch uno para la forma y otro para la creación del objeto, ya que tendríamos el control para
         */
        switch (entrada){

            case 1:
                formaEscogida="Circulo";
                forma2 = new Circulo (parametro);
                break;

            case 2:
                formaEscogida="Cuadrado";
                forma2 = new Cuadrado (parametro);
                break;

            case 3:
                formaEscogida="TrianguloEquilatero";
                forma2 = new TrianguloEquilatero (parametro);
                break;

            default:
                System.out.println("Ha realizado una selección no valida.");
                System.exit(0);
        }
        System.out.println("Has escogido la forma "+ formaEscogida + " con un parámetro "+parametro+" .");
        System.out.println("");

        /**
         * Menu de opciones al usuario para escoger la operación a realizar.
         */
        System.out.println("Que cálculo quieres realizar con la forma escogida:");
        System.out.println("1: Saber Area");
        System.out.println("2: Saber Perimetro");
        System.out.println("3: Saber tanto el Perimetro como el Area");

        /**
         * Creo un try catch alrededor del scanner por si se introduce texto. Más abajo regulo si se introduce un valor fuera de opciones.
         */

        try {
            entrada = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Ha introducido un valor erróneo");
            System.exit(0);
        }
/**
 * Switch donde según selección del usuario llamamos a una función u otra. Atención al uso del mismo nombre del objeto para todos. Polimorfismo.
 */
        switch (entrada){
            case 1:
                System.out.println("El Area del "+formaEscogida+ "es: "+ forma2.area());
            break;

            case 2:
                System.out.println("El Perimetro del "+formaEscogida+ "es: "+ forma2.perimetro());
                break;

            case 3:
                System.out.println("El Area del "+formaEscogida+ "es: "+ forma2.area()+" y el Perimetro del "+formaEscogida+ "es: "+ forma2.perimetro());
                break;

            default:
                System.out.println("Ha realizado una selección no valida.");
                System.exit(0);
        }
    }
}
