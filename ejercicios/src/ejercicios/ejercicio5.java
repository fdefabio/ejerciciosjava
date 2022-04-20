// PROGRAMA QUE IMPRIME LAS 10 TABLAS DE MULTIPLICAR

package ejercicios;

public class ejercicio5 {
    public static void main(String args []){
        for(int tablas = 1 ; tablas <= 10 ; tablas ++){
            System.out.println("***************** Tabla del " + tablas + " ***************");
            for( int tabla = 1 ;tabla <= 10; tabla ++){
                System.out.println(tablas + " * "+ tabla + " = " +tablas * tabla);
            }
        }
    }

}
