package ejercicios;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String args []){
        int flag = 0;
        int numero         = 0;
        int elevarPotencia = 0;
        int resultado      = 0;
        Scanner receptor = new Scanner(System.in);

        System.out.println("Digite a que potencia desea elevar el numero");
        elevarPotencia = receptor.nextInt();

        System.out.println("Digite el numero que desea elevar");
        numero = receptor.nextInt();

        while
        (flag < elevarPotencia ){
            if (numero == 1){
                resultado = numero;
            } else if (numero == 0) {
                resultado = numero;
            }else {
                resultado = numero * numero;
            }
           flag ++;
        }

        System.out.println(resultado);
    }
}
