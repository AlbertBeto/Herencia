package EjerciciosAbstract;

public class MainAbstract {

    public static void main(String[] args) {
/*
        SubClase alfa = new SubClase();

        alfa.abstract_method();
        alfa.no_abstract_method();
*/

        HourlyEmployee Albert = new HourlyEmployee(8,38);
        System.out.println("El sueldo de Albert de esta semana es: "+Albert.calculateWeeklyPay());

    }
    //class
}
