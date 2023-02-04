package EjercicioEncapsulacion;

public class Impresora {

    private int nivelToner=100;
    private int paginasImpresas=0;
    private int hojasImpresas=0;
    private boolean impresoraDobleCara=true;

    public Impresora(boolean impresoraDobleCara){
        setImpresoraDobleCara(impresoraDobleCara);
    }


    private void setImpresoraDobleCara(boolean impresoraDobleCara) {
        this.impresoraDobleCara = impresoraDobleCara;
    }

    public int anyadirToner(int neoToner){
        if(nivelToner+neoToner>100 || nivelToner+neoToner<nivelToner){
            System.out.println("No hasintroducido un valor correcto.");
            return -1;
        }else{
            nivelToner += neoToner;
            System.out.println(nivelToner);
            return nivelToner;
        }
    }

    public int imprimirPaginas(int paginas){

        if (paginas<0){
            System.out.println("Has puesto impresiones negativas, meganto.");
            return 0;
        } else if (nivelToner-paginas<0) {
            System.out.println("No hay bastante tones para todas las impresiones.");
            System.out.println("El nivel de toner actual es: "+nivelToner);
            return 0;

    }else if (impresoraDobleCara==false){
            paginasImpresas += paginas;
            hojasImpresas += paginas;
            nivelToner-=paginas;
            return hojasImpresas;

        }else{
            if (paginas%2!=0){
                paginasImpresas += paginas;
                hojasImpresas= hojasImpresas +((paginas+1)/2);
                nivelToner-=paginas;
                System.out.println("Llevas impresas "+paginasImpresas+" paginas y has gastado "+hojasImpresas+" A4s.");
                System.out.println("El nivel de toner actual es: "+nivelToner);
                return hojasImpresas;
            }else{
                paginasImpresas += paginas;
                hojasImpresas= hojasImpresas +(paginas/2);
                nivelToner-=paginas;
                System.out.println("Llevas impresas "+paginasImpresas+"paginas y has gastado "+hojasImpresas+" A4s.");
                System.out.println("El nivel de toner actual es: "+nivelToner);
                return hojasImpresas;
            }
        }
     //imprimirPaginas
    }
    //class
}
