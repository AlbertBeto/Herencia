package EjerciciosInterfacesBienes;

public class MainInterface {
    public static void main(String[] args) {

        Bienes silla = new Bienes("Plataforma con 3/4 patas donde sentarse",100.00);
        Bienes hamburguesa = new Comida("Hamburguesa Completa con lechuga, tomate, mayonesa y carne de ternera", 8.99,750);
        Bienes TropasDelEspacio = new Libro("Novela Ciencia Ficción militarista", 14.99,"Robert A. Heinlein");
        Bienes OsoPelucheGigante = new Juguete("Oso Teddy Gigante implosible de abrazar completamente de lo grande que es. ", 120.00,6);

        System.out.println(silla.toString());
        System.out.println(hamburguesa.toString());
        System.out.println(TropasDelEspacio.toString());
        System.out.println(OsoPelucheGigante.toString());







    }
    //class
}
