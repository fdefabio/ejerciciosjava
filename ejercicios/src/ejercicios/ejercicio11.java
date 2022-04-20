/*
Programa que pida el sueldo d N trabajadores e imprima el que tiene mayor sueldo
*/

package ejercicios;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String args[]){
        int salarioAnterior = 0;
        int salarioActual   = 0;
        Scanner receptor    = new Scanner(System.in);


        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese un salario");
            salarioAnterior = receptor.nextInt();
            if(salarioAnterior > salarioActual){
                salarioActual = salarioAnterior;
            }
        }
        System.out.println("el salario mayor es:" + salarioActual);
    }
}
