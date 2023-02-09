package EjerciciosInterfacesII;

import java.util.Scanner;

public class MainFormasIntII {

    public static void main(String[] args) {

        String formaEscogida;
        double parametro;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escoge una forma:");
        System.out.println("A: Circulo");
        System.out.println("B: Cuadrado");
        System.out.println("C: Triangulo Equilatero");
        formaEscogida=sc.nextLine();

        switch (formaEscogida){

            case "A":
                System.out.println("Introduce el radio del circulo");
                parametro=sc.nextDouble();



        }



    }

}
