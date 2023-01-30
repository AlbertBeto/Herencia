package composicion;

public class Ordenador {

    private Monitor monitor;
    private Procesador procesador;
    private Teclado teclado;

    public Ordenador(Monitor monitor, Procesador procesador, Teclado teclado) {
        this.monitor = monitor;
        this.procesador = procesador;
        this.teclado = teclado;
    }

    //Al tenerlo todo en privado creamos un metodo publico para poder llamarlo desde fuera.

    public void encender(){
        this.getProcesador().presionarBotonEncendido();
        dibujarLogo();
    }

    private void dibujarLogo(){
        getMonitor().dibujarPixel(12,12);
    }


    private Monitor getMonitor() {
        return monitor;
    }

    private void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    private Procesador getProcesador() {
        return procesador;
    }

    private void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    private Teclado getTeclado() {
        return teclado;
    }

    private void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }
}
