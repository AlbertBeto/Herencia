import java.time.LocalDate;

public class Programador extends Empleado {
    //El extenda hace que programador sea herencia.

    /* Todo esto sobra pq viene del objeto. Lo unico que no se hereda son los contructores
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private double salario;
    private int numero;
    private String address;
    */


    private String equipo;
    private String role;
    private double bonus;

    public Programador(){

    }


    //Atributos en vez de privado pasarlo a protected ya que tienen acceso los hijos.
    public Programador (String dni){
        //this.dni=dni;
        //Con super llamamos al constructor padre.
        super(dni);
    }

    @Override
    public double calculateSalaryAnual(){
        //Llamamos el metodo del padre con un super.
        double resultado= super.calculateSalaryAnual();
        resultado +=bonus;
        return resultado;
    }

}
