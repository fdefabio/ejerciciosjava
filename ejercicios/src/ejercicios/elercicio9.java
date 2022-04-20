/*
PROGRAMA QUE CALCULE EL MAYOR Y MENOR DE N NUMEROS
*/

package ejercicios;

import java.util.Scanner;

public class elercicio9 {
    public static void main (String args []){
        int numeroActual   = 0;
        int numeroAnterior = 0;
        int menor          = 0;
        int arrayMenor[]   = new int [5];
        int arrayMenor2[]  = new int [5];

        Scanner receptor = new Scanner (System.in);

        for (int i = 0; i < 5; i++){
            System.out.println("ingrese un numero");
            numeroAnterior = receptor.nextInt();
            arrayMenor[i]  = numeroAnterior;
            if(numeroAnterior > numeroActual){
                numeroActual = numeroAnterior;
            }

        }

        for (int numero = 0 ; numero < 5 ; numero ++){
            arrayMenor2[numero] = arrayMenor[numero];
        }

        for ( int numero1 : arrayMenor) {
           for (int numero2 : arrayMenor2){
               if(numero2 < numero1){
                   menor = numero2;

               }
           }
        }
        System.out.println("El numero mayor es :" + numeroActual);
        System.out.println("El numero menor es :" + menor);
    }
}
