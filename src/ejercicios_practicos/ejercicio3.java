package ejercicios_practicos;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa una frase o palabra");
        String frase = leer.nextLine();

        if (frase.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

}
