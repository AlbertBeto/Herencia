package InterfaceGrabarArchivo;

import java.io.FileWriter;
import java.io.PrintWriter;

public class MyList implements Salvable{


    public  MyList() {

    }

    @Override
    public void guardar(int[] array) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            /**
             * Aqui esta la ruta a archivo y el escritor como tal.
             */
            fichero = new FileWriter("archivo.txt");
            pw = new PrintWriter(fichero);
            /**
             * A continuación es donde está el lector del array y que copia cada campo en una línea.
             */
            for (int i = 0; i < array.length; i++)
                pw.println(array[i]);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente, aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    //class
}
