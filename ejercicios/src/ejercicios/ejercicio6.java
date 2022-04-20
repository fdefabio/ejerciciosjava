// PROGRAMA QUE REALIZA LA TABLA DE MULTIPLICAR DE CUALQUIER DIGITO

package ejercicios;

import java.util.Scanner;

public class ejercicio6 {
    public static void main (String args []){
        Scanner receptor = new Scanner(System.in);
        int tablas       = 0;

        System.out.println("Ingrese un numero para ver su tabla");
        tablas = receptor.nextInt();
        for( int tabla = 1 ;tabla <= 10; tabla ++){
            System.out.println(tablas + " * "+ tabla + " = " +tablas * tabla);
        }
    }

}
