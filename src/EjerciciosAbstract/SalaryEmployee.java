package EjerciciosAbstract;

public class SalaryEmployee extends Employee{

    protected double salarioSemanal;

    public SalaryEmployee(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }


    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    protected double calculateWeeklyPay() {
        return salarioSemanal;
    }
}
