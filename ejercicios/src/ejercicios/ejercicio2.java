/*
Escribe un programa en JAVA que obtenga la suma e imprima los términos de la siguiente serie:
2, 5, 7, 10, 12, 15, 17, . . ., 1 800
*/
package ejercicios;

public class ejercicio2 {
    public static void main(String args []){
        int flag = 1;
        for (int numero = 0 ; numero < 1800 ;){

            if (flag == 1){
                numero = numero + 2;
                System.out.print(numero + ",");
                flag = flag + 1;
            }
            else if (flag == 2){
                numero = numero + 3;
                System.out.print(numero + ",");
                flag = flag - 1;
            }
        }
    }
}
