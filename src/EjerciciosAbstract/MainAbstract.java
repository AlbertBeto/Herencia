package EjerciciosAbstract;

public class MainAbstract {

    public static void main(String[] args) {
/*
        SubClase alfa = new SubClase();

        alfa.abstract_method();
        alfa.no_abstract_method();
*/

       // HourlyEmployee Albert = new HourlyEmployee(8,38);
       // System.out.println("El sueldo de Albert de esta semana es: "+Albert.calculateWeeklyPay());

Rectangulo jar =new Rectangulo(4,2,3);

        System.out.println(jar.getArea());
        System.out.println(jar.getPerimeter());

        jar.redimensionar(2);
        System.out.println(jar.getArea());
        System.out.println(jar.getPerimeter());

    }
    //class
}
