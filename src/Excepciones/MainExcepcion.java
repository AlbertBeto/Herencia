package Excepciones;

public class MainExcepcion {

    public static void main(String[] args) throws MiExcepcion {

ExcepcionTururu test = new ExcepcionTururu();
try {
    test.division();
}catch(ArithmeticException e) {
    System.out.println("Hay algo aquí que va mal!!");
}



test.divisor();





        //main
    }
    //class
}
