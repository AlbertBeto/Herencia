package composicion;

public class Main {

    public static void main(String[] args) {



        Procesador procesador = new Procesador("Intel",2,3);
        Monitor monitor = new Monitor("Dell","2000x1200",24);
        Teclado teclado = new Teclado("Negro",90);

        Ordenador ordenador = new Ordenador(monitor, procesador,teclado);

        //Al tener las clases en privado tengo que llamar a los metodos atraves de ordenador

        ordenador.encender();

        // Si pones ordenador. te sale el listado de las opciones que has permitido.



    }

}
