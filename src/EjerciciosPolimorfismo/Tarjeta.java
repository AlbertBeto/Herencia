package EjerciciosPolimorfismo;

class Tarjeta {
    protected String destinatario;
    public void saludar() {}
}

//El nostre objecte Tarjeta pot ser cambiat/transformat a cualsevol de les clases herederes sempre que cumpleixes els atributs del constructor.
//EL marca es la clase amb el que crees.
class Vacaciones extends Tarjeta {
    public Vacaciones( String r ) {
        destinatario = r;
    }
    public void saludar() {
        System.out.println("Querido " + destinatario + ",");
        System.out.println("Saludos veraniegos!\n");
    }
}

class Aniversario extends Tarjeta {
    private int edad;
    public Aniversario ( String r, int edad) {
        destinatario = r;
        edad = edad;
    }

    public void saludar() {
        System.out.println("Querido " + destinatario + ",");
        System.out.println("Feliz " + edad + " Aniversario\n");
    }
}

class SanValentin extends Tarjeta {
    private int besos;

    public SanValentin ( String r, int k ) {
        destinatario = r;
        besos = k;
    }

    public void saludar() {
        System.out.println("Querido " + destinatario + ",");
        System.out.println("Con amor y besos,");
        for ( int j=0; j < besos; j++ )
            System.out.print("X");
        System.out.println("\n");
    }
}
