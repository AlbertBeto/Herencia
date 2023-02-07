package EjerciciosInterfaces.Pastillas;

public class Pastillas implements IBlister, ICajasPastillas {

    private String nombre;
    private int gramaje;
    private String forma;

    public Pastillas(String nombre, int gramaje, String forma) {
        this.nombre = nombre;
        this.gramaje = gramaje;
        this.forma = forma;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGramaje() {
        return gramaje;
    }

    public String getForma() {
        return forma;
    }

    @Override
    public void prensarPastilla() {
        int cuantas=IBlister.pastillasBlister;
        System.out.println(cuantas);
        System.out.println("La pastilla se ha prensado.");
    }


    @Override
    public int diasMedicacion(int pastillasDia) {
       int aldia=(blistersCaja*ICajasPastillas.pastillasBlister)/pastillasDia;

        return 0;
    }


}

