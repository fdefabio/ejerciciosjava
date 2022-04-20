package com.Persona;

import java.util.Scanner;

public class main {
    public static void main(String args []){
        Scanner ingresar   = new Scanner(System.in);
        persona estudiante = new persona();
        String nombre;
        String apellidos;
        String id;
        String correo;
        String pais;
        int    edad;


        System.out.println("ingrese su nombre");
        nombre    = ingresar.next();
        estudiante.setNombre(nombre);

        System.out.println("ingrese sus apellidos");
        apellidos = ingresar.next();
        estudiante.setApellidos(apellidos);

        System.out.println("ingrese su numero de identificacion");
        id        = ingresar.next();
        estudiante.setId(id);

        System.out.println("ingrese su correo");
        correo    = ingresar.next();
        estudiante.setCorreo(correo);

        System.out.println("ingrese su pais de origen");
        pais      = ingresar.next();
        estudiante.setPais(pais);

        System.out.println("ingrese su edad");
        edad      = ingresar.nextInt();
        estudiante.setEdad(edad);

        System.out.println("******************* Datos del estudiante 1 ************************");

        System.out.println("Nombre:\t"                   + estudiante.getNombre()    + "\n" +
                           "Apellidos:\t"                + estudiante.getApellidos() + "\n" +
                           "Numero de identificacion:\t" + estudiante.getId()        + "\n" +
                           "Correo:\t"                   + estudiante.getCorreo()    + "\n" +
                           "Pais:\t"                     + estudiante.getPais()      + "\n" +
                           "Edad:\t"                     + estudiante.getEdad()      + "\n");

        // Instancia estudiante sin metodos setters

        persona estudiante2 = new persona("juan" , "bonilla" , "102225668" , "juanjo@gmail.com",
                                          "colombia" , 20  );

        System.out.println("******************* Datos del estudiante 2 ************************");

        System.out.println("Nombre:\t"        + estudiante2.getNombre()    + "\n" +
                "Apellidos:\t"                + estudiante2.getApellidos() + "\n" +
                "Numero de identificacion:\t" + estudiante2.getId()        + "\n" +
                "Correo:\t"                   + estudiante2.getCorreo()    + "\n" +
                "Pais:\t"                     + estudiante2.getPais()      + "\n" +
                "Edad:\t"                     + estudiante2.getEdad()      + "\n");
    }
}
