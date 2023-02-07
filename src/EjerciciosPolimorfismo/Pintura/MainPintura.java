package EjerciciosPolimorfismo.Pintura;

public class MainPintura {

    public static void main(String[] args) {
        Pintura titan = new Pintura(250);

        Forma esfera=new Esfera(15);
        titan.pinturaNecesaria(esfera);

        Forma recta = new Rectangulo(20.0,35.0);
        titan.pinturaNecesaria(recta);

        Forma cilindro = new Cilindro(10, 30);
        titan.pinturaNecesaria(cilindro);

    }


    //class
}
