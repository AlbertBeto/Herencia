package EjerciciosAbstract;

public abstract class Employee {

    protected String nombre;
    protected String cargo;

    protected abstract double calculateWeeklyPay();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
