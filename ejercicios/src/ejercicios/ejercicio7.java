/*
Dado como datos las calificaciones de 20 alumnos de la materia de fundamentos de programación, realiza un programa en JAVA que obtenga lo siguiente:
-    Promedio general
-    Imprima las calificaciones en orden inverso
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String args []){
        int notas                  = 0;
        Scanner receptor           = new Scanner(System.in);
        String listaDeNotas        = "";
        String listaDeNotasReversa = "";
        StringBuilder strb2        = new StringBuilder(listaDeNotas);
        int promedio               = 0;
        int sumanotas              = 0;

        for(int numeroDeNotas = 1; numeroDeNotas <= 20; numeroDeNotas++){
            System.out.println("ingrese una nota de estudiante");
            notas = receptor.nextInt();
            sumanotas = sumanotas + notas;
            listaDeNotas += notas + ",";
            strb2  = new StringBuilder(listaDeNotas);

        }
        promedio = sumanotas / 20;
        listaDeNotasReversa = strb2.reverse().toString();
        System.out.println("Promedio = " + promedio);
        System.out.println(listaDeNotasReversa);
    }
}
