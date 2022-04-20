package ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String args []){
        int numero = 0;
        int elevarPotencia;
        int resultado = 0;
        Scanner receptor = new Scanner(System.in);

        System.out.println("Digite a que potencia desea elevar el numero");
        elevarPotencia = receptor.nextInt();

        System.out.println("Digite el numero que desea lelvar");
        numero = receptor.nextInt();

        for (int i = 0; i < elevarPotencia; i++){
            if (numero == 1){
                resultado = numero;
            } else if (numero == 0) {
                resultado = numero;
            }else {
                resultado = numero * numero;
            }

        }

        System.out.println(resultado);
    }
}
