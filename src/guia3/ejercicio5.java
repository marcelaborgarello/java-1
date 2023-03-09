//Escriba un programa en el cual se ingrese un valor límite positivo, 
//y a continuación solicite números al usuario 
//hasta que la suma de los números introducidos supere el límite inicial.
package guia3;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un valor limite positivo");

        int valorLimite = leer.nextInt();
        int suma = 0;

        while (valorLimite > suma) {
            System.out.println("Ingresa un numero");
            int num = leer.nextInt();
            suma += num;
        }
        System.out.println("El resultado de la suma es " + suma
                + " Supero el valor limite.");
    }

}
