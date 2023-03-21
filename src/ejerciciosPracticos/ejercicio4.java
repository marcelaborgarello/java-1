package ejerciciosPracticos;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa una frase o palabra");

        String frase = leer.nextLine();

        System.out.println(frase.toLowerCase().endsWith("a"));        
        System.out.println(frase.toUpperCase().startsWith("A"));
        if (frase.toUpperCase().startsWith("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

//        if (frase.toLowerCase().substring(0, 1).equals("a")) {
//            System.out.println("CORRECTO");
//        } else {
//            System.out.println("INCORRECTO");
//        }
//aho
    }

}
