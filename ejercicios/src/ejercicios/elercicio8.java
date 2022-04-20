/*
Calcule el aumento de sueldo para un grupo de empleados de una empresa teniendo en cuenta el siguiente criterio:
Si el sueldo es inferior a $1,000.00                         : Aumento 15%
Si el sueldo es mayor o igual a $1,000.00             : Aumento 12%
El programa debe hacer lo siguiente:
-        Guardar los nuevos sueldos en el arreglo
-        Calcular la nómina
-        Imprimir los sueldos desde el arreglo
*/

package ejercicios;

import java.util.Scanner;

public class elercicio8 {
    public static void main(String args []){
        Scanner receptor = new Scanner(System.in);
        int salarios []  = new int [5] ;
        int salario;
        int nomina = 0;

        for (int i = 0; i < salarios.length; i++){
            System.out.println("ingrese salario del trabajador " + i);
            salario = receptor.nextInt();
            if (salario < 1000){
                salario = salario + ((salario / 100) * 15);
            }else {
                salario = salario + ((salario / 100) * 12);
            }
            nomina = nomina + salario;
            salarios[i] += salario;

        }
        System.out.println("Nomina: " + nomina);
        System.out.print("Salarios: ");
        for ( int salarioTrabajador : salarios){

           System.out.print(salarioTrabajador + " ");

       }
    }
}
