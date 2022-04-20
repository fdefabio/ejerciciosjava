/*
Realiza el programa en JAVA tal que dado como datos la matrícula y 5 calificaciones de un alumno; imprima la matrícula, el promedio y la palabra “aprobado” si el alumno tiene un promedio mayor o igual que 6, y la palabra “no aprobado” en caso contrario.
Datos: MAT, CAL1, CAL2, CAL3, CAL4, CAL5
Donde: MAT es una variable entera que representa la matrícula del alumno.
CAL1, CAL2, CAL3, CAL4 y CAL5 son variables de tipo real que representan las 5 calificaciones del alumno
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio3 {


    public static void main(String args []){
        int matricula = 0;
        int nota      = 0;
        int promedio  = 0;
        Scanner receptor = new Scanner(System.in);

        System.out.println("Ingrese la matricula");
        matricula = receptor.nextInt();

        for(int cantidadCalificaciones = 1; cantidadCalificaciones <= 5 ; cantidadCalificaciones++ ){
            System.out.println("Ingrese nota # " + cantidadCalificaciones);
            nota = receptor.nextInt();
            promedio += nota;
        }

        promedio = promedio / 5;

        if(promedio >= 6){
            System.out.println("Matricula" + matricula);
            System.out.println("El estudiante aprobo con promedio de :" + promedio);
        }
        else{
            System.out.println("Matricula" + matricula);
            System.out.println("El estudiante reprobo con promedio de :" + promedio);
        }

    }
}
