package EjerciciosInterfacesII;

import java.util.Scanner;

public class MainFormasIntII {

    public static void main(String[] args) {

        String formaEscogida="";
        int entrada;
        double parametro;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escoge una forma:");
        System.out.println("1: Circulo");
        System.out.println("2: Cuadrado");
        System.out.println("3: Triangulo Equilatero");
        entrada=sc.nextInt();

        System.out.println("Introduce el parametro");
        parametro=sc.nextDouble();

        ShapeOperable forma2 = null;
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
        }
        System.out.println("Has escogido la forma "+ formaEscogida + " con un parametro "+parametro+" .");
        System.out.println("");
        System.out.println("Que cálculo quieres realizar con la forma escogida:");
        System.out.println("1: Saber Area");
        System.out.println("2: Saber Perimetro");
        System.out.println("3: Saber tanto el Perimetro como el Area");

        entrada=sc.nextInt();


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
        }
    }
}
