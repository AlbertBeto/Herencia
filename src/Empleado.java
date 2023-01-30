import java.time.LocalDate;

public class Empleado {
//Si haces la clase privada impides que la clase tenga hijos.
    //Si el metodo lo marcamos privado no nos permite revalorizar desde un hijo.
    //Los protected pueden acceder lo hijos.
    protected String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private double salario;
    private int numero;
    private String address;

    public Empleado() {}

    public Empleado(String dni){
        this.dni=dni;
    }

    //getters y setters

    public double calculateSalaryAnual(){
        return 14*salario;
    }




    //class
}
