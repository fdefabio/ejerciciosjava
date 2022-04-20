/*
Escribe un programa en JAVA tal que dado como datos 270 números enteros (introducidos por teclado), obtenga la suma de los números impares
y el promedio de los números pares.Datos: NUM1, NUM2, . . ., NUM270 Donde: NUMi es una variable de tipo entero que representa el número entero i
que se ingresa (1 ≤ i ≤ 270).
*/

package ejercicios;
public class ejercicio1 {
    public static void main(String args []){
        int sumapares   = 0;
        int sumaimpares = 0;

        for (int numero = 0; numero < 270; numero++){
            if(numero % 2 == 0){
                sumapares   = sumapares + numero;
            }
            else{
                sumaimpares = sumaimpares + numero;
            }

        }
        System.out.println("Suma de pares:\t"   +sumapares);
        System.out.println("Suma de impares:\t" + sumaimpares);

    }

}