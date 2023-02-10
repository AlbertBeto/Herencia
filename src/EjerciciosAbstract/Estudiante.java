package EjerciciosAbstract;

public class Estudiante implements Comparable<Estudiante>{

    protected String nombre;
    protected int edad;
    protected int altura;

    public Estudiante(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public int compareTo(Estudiante x) {
        if(this.getAltura()< x.getAltura()){
            return 1;
        }else if(this.getAltura()==x.getAltura()){
            if(this.getEdad()<x.getEdad()){
                return 1;
            }else{return 0;}
        }else{
            return -1;
        }
    }
}
