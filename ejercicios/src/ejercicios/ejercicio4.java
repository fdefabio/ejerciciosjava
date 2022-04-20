/*
Realiza el programa en JAVA tal que dado como dato el sueldo de un trabajador, le aplique un aumento del 15% si su sueldo es inferior a $1000
y 12% en caso contrario. Imprima el nuevo sueldo del trabajador.
 */

package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String args[]){
        int sueldo = 0;
        Scanner receptor = new Scanner(System.in);

        System.out.println("Ingrese el salario del empleado");
        sueldo = receptor.nextInt();

        if(sueldo < 1000){

            sueldo = sueldo + ((sueldo / 100) * 15);
        }
        else {
            sueldo = sueldo + ((sueldo / 100) * 12);
        }
        System.out.println("el sueldo es:" + sueldo);
    }

}
