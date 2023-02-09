package EjerciciosInterfacesBienes;

public class MainInterface {
    public static void main(String[] args) {

        Bienes silla = new Bienes("Plataforma con 3/4 patas donde sentarse",100.00);
        Comida hamburguesa = new Comida("Hamburguesa Completa con lechuga, tomate, mayonesa y carne de ternera", 8.99,750);
        Libro tropasDelEspacio = new Libro("Novela Ciencia Ficción militarista", 14.99,"Robert A. Heinlein");
        Juguete osoPelucheGigante = new Juguete("Oso Teddy Gigante imposible de abrazar completamente de lo grande que es. ", 120.00,6);
/*
        System.out.println(silla.toString());
        System.out.println(hamburguesa.toString());
        System.out.println(tropasDelEspacio.toString());
        System.out.println(osoPelucheGigante.toString());


        System.out.println(tropasDelEspacio.calculoImpuestos());
        System.out.println(osoPelucheGigante.calculoImpuestos());
*/
        System.out.println(tropasDelEspacio.getAutor());
    }
    //class
}
