package EjercicioEncapsulacion;

public class Impresora {

    private int nivelToner=100;
    private int paginasImpresas=0;
    private int hojasImpresas=0;
    private boolean impresoraDobleCara=true;

    public int anyadirToner(int neoToner){
        if(nivelToner+neoToner>100 || nivelToner+neoToner<nivelToner){
            System.out.println(-1);
            return -1;
        }else{
            nivelToner += neoToner;
            System.out.println(nivelToner);
            return nivelToner;
        }
    }

    public int imprimirPaginas(int paginas){
        if (impresoraDobleCara==false){
            paginasImpresas += paginas;
            hojasImpresas += paginas;
            return hojasImpresas;

        }else{
            if (paginas%2!=0){
                paginasImpresas += paginas;
                hojasImpresas= hojasImpresas +((paginas+1)/2);
                return hojasImpresas;
            }else{
                paginasImpresas += paginas;
                hojasImpresas= hojasImpresas +(paginas/2);
                return hojasImpresas;
            }
        }
     //imprimirPaginas
    }





    //class
}
