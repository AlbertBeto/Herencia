package Excepciones;

public class ExcepcionTururu {
    String texto = "Test";
    public void division(){

        System.out.println(3/0);

    }


        public void divisor () throws MiExcepcion{
try {
    int divisor = Integer.parseInt("Mi divisor");
}catch (NumberFormatException e){
    //throw MiExcepcion;
}
    }
//class
}
