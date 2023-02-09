package EjerciciosInterfacesBienes;

public class MainInterface {
    public static void main(String[] args) {

        Bienes silla = new Bienes("Plataforma con 3/4 patas donde sentarse",100.00);
        Comida hamburguesa = new Comida("Hamburguesa Completa con lechuga, tomate, mayonesa y carne de ternera", 8.99,750);
        Libro TropasDelEspacio = new Libro("Novela Ciencia Ficción militarista", 14.99,"Robert A. Heinlein");

        Libro[] cienciaficcion = new Libro[4];
        cienciaficcion[0]= new Libro("Tropas del Espacio. Novela Ciencia Ficción militarista", 14.99,"Robert A. Heinlein");
        cienciaficcion[1]= new Libro("2001",24.99,"Arthur C. Clarke");
        cienciaficcion[2]= new Libro("Tigre! Tigre!. Una persona prepara una venganza que va mas alla de las estrellas",22.50,"Alfred Bester");
        cienciaficcion[3]= new Libro("Los propios dioses. Contra la estupidez, los propios dioses luchan en vano", 100.00,"Isaac Asimov");
        System.out.println("El del array es:");
        System.out.println(cienciaficcion[0]);

        System.out.println("Ya ha pasado el del array");
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
