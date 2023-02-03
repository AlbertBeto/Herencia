package EjercicioComposicion;

public class EquipoPersonaje {

    private int proteccionFisicaCompleta;
    private int resitenciaGolpesTotal;

    private Cabeza cabeza;
    private Torso torso;
    private BrazosGuantes brazosGuantes;
    private Piernas piernas;
    private Botas botas;

    public EquipoPersonaje(Cabeza cabeza, Torso torso, BrazosGuantes brazosGuantes, Piernas piernas, Botas botas) {
        this.cabeza = cabeza;
        this.torso = torso;
        this.brazosGuantes = brazosGuantes;
        this.piernas = piernas;
        this.botas = botas;
        setProteccionFisicaCompleta(cabeza.getProteccionFisica()+torso.getProteccionFisica()+brazosGuantes.getProteccionFisica()+piernas.getProteccionFisica()+botas.getProteccionFisica());
        setResitenciaGolpesTotal(cabeza.getResistenciaGolpes()+torso.getResistenciaGolpes()+brazosGuantes.getResistenciaGolpes()+piernas.getResistenciaGolpes()+botas.getResistenciaGolpes());
    }



    public void setProteccionFisicaCompleta(int proteccionFisicaCompleta) {
        this.proteccionFisicaCompleta = proteccionFisicaCompleta;
    }

    public void setResitenciaGolpesTotal(int resitenciaGolpesTotal) {
        this.resitenciaGolpesTotal = resitenciaGolpesTotal;
    }

    public int getProteccionFisicaCompleta() {
        return proteccionFisicaCompleta;
    }

    public int getResitenciaGolpesTotal() {
        return resitenciaGolpesTotal;
    }

    //class
}
