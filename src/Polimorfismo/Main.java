package Polimorfismo;

public class Main {

    public static Pelicula crearPeliculaAleatoria(){
        int numero = (int) (Math.random() *3)+1;
        System.out.println(numero);

        switch (numero){
            case 1:
                return new Spiderman();

            case 2:
                return new Shrek();
            case 3:
                return new RandomPeli();




        }
        return null;

    }


    public static void main(String[] args) {
        for(int i=0; i<3;i++){
            Pelicula pelicula = crearPeliculaAleatoria();
            pelicula.trama();
        }

    }



    //class
}
