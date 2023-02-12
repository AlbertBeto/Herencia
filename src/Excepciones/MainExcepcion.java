package Excepciones;

public class MainExcepcion {

    public static void main(String[] args) {

ExcepcionTururu test = new ExcepcionTururu();
try {
    test.division();
}catch(ArithmeticException e) {
    System.out.println("Hay algo aquí que va mal!!");
}


try {
test.divisor();

}catch(NumberFormatException e){
    System.out.println("Hay algo aquí que va mal!!");
}

        //main
    }
    //class
}
