package EjerciciosAbstract;

public class HourlyEmployee extends Employee{

    protected double tasaPago;
    protected int horasTrabajadas;

    public HourlyEmployee(double tasaPago, int horasTrabajadas) {
        this.tasaPago = tasaPago;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    protected double calculateWeeklyPay() {

        return tasaPago*horasTrabajadas;
    }





}
