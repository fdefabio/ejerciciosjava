/*
 Progama que indique el total a pagar en una farmacia si el total apagar es:
 0 a 500 0% de descuento
 501 a 1000 5%
 1001 a 7000 11%
 7001 a 15000 18%
 150001 en adelante 25%
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio10 {
    public static void main (String args[]){
        int valor     = 0;
        int resultado = 0;
        Scanner receptor = new Scanner(System.in);

        System.out.println("Ingrese valor");
        valor = receptor.nextInt();

        if (valor <= 500){
            resultado = valor;
        }
        else if (valor > 500 && valor < 1000){
            resultado = valor - ((valor / 100) * 5);
        }
        else if (valor > 1000 && valor < 7000){
            resultado = valor - ((valor / 100) * 11);
        }
        else if (valor > 7000 && valor < 15000){
            resultado = valor - ((valor / 100) * 18);
        }
        else if (valor > 15000){
            resultado = valor - ((valor / 100) * 25);
        }

        System.out.println("Valor original :" + valor);
        System.out.println("Con descuento :"  + resultado);
    }
}
