package EjerciciosInterfacesBienes;

public class MainInterface {
    public static void main(String[] args) {

        Bienes silla = new Bienes("Plataforma con 3/4 patas donde sentarse",100.00);
        Comida hamburguesa = new Comida("Hamburguesa Completa con lechuga, tomate, mayonesa y carne de ternera", 8.99,750);
        Libro TropasDelEspacio = new Libro("Novela Ciencia Ficción militarista", 14.99,"Robert A. Heinlein");
        Juguete OsoPelucheGigante = new Juguete("Oso Teddy Gigante implosible de abrazar completamente de lo grande que es. ", 120.00,6);

        System.out.println(silla.toString());
        System.out.println(hamburguesa.toString());
        System.out.println(TropasDelEspacio.toString());
        System.out.println(OsoPelucheGigante.toString());


        System.out.println(TropasDelEspacio.calculoImpuestos());
        System.out.println(OsoPelucheGigante.calculoImpuestos());


    }
    //class
}
