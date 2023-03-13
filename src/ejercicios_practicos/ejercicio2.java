//Crear un programa que pida una frase 
//y si esa frase es igual a “eureka” 
//el programa pondrá un mensaje de Correcto, 
//sino mostrará un mensaje de Incorrecto. 
//Nota: investigar la función equals() en Java.
package ejercicios_practicos;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa una palabra");
        String palabra = leer.nextLine();

        if (palabra.toLowerCase().equals("eureka")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }

}
