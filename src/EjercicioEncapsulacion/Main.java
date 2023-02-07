package EjercicioEncapsulacion;

public class Main {

    public static void main(String[] args) {
        Impresora Xerox = new Impresora(true);

        Xerox.imprimirPaginas(50);
        Xerox.imprimirPaginas(-50);
        Xerox.imprimirPaginas(75);
        Xerox.anyadirToner(100);
        Xerox.anyadirToner(-50);
        Xerox.anyadirToner(25);
        Xerox.imprimirPaginas(75);


    }


    //class
}
