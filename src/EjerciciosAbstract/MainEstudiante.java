package EjerciciosAbstract;

import java.util.Arrays;

public class MainEstudiante {

    public static void main(String[] args) {
        Estudiante[] cursoAlfa = new Estudiante[5];
        Estudiante Patri = new Estudiante("Patri",12,170 );
        Estudiante Manuel = new Estudiante("Manuel", 43,173);
        Estudiante Javier = new Estudiante("Javier",72,189);
        Estudiante Alicia = new Estudiante("Alicia", 52, 168);
        Estudiante Albert = new Estudiante("Albert", 35, 189);

        cursoAlfa[0]=Patri;
        cursoAlfa[1]=Manuel;
        cursoAlfa[2]=Javier;
        cursoAlfa[3]=Alicia;
        cursoAlfa[4]=Albert;

        for (int i=0;i< cursoAlfa.length;i++) {
            System.out.println("Nombre: "+cursoAlfa[i].getNombre()+" Altura: "+cursoAlfa[i].getAltura()+" Edad: "+cursoAlfa[i].getEdad());
        }
/*
        Arrays.sort(cursoAlfa);
        System.out.println();
        System.out.println();
        System.out.println("EL array ordenado por sort");

        for (int i=0;i< cursoAlfa.length;i++) {
            System.out.println("Nombre: "+cursoAlfa[i].getNombre()+" Altura: "+cursoAlfa[i].getAltura()+" Edad: "+cursoAlfa[i].getEdad());
        }

 */

        System.out.println();
        System.out.println();
        System.out.println("EL array ordenado por compare");
 int comparadorExit=0;
while (comparadorExit==0) {
comparadorExit=1;
    for (int i = 0; i < cursoAlfa.length; i++) {

        Estudiante[] guardaViejo = new Estudiante[1];

        if(i+1<cursoAlfa.length){
            if(cursoAlfa[i].compareTo(cursoAlfa[i+1])==1){
                guardaViejo[0]=cursoAlfa[i];
                cursoAlfa[i]=cursoAlfa[i+1];
                cursoAlfa[i+1]=guardaViejo[0];
                comparadorExit=0;
            }
        }
        //for
    }

        //while
}
        for (int i=0;i< cursoAlfa.length;i++) {
            System.out.println("Nombre: "+cursoAlfa[i].getNombre()+" Altura: "+cursoAlfa[i].getAltura()+" Edad: "+cursoAlfa[i].getEdad());
        }
            //main
    }

    //class
}
