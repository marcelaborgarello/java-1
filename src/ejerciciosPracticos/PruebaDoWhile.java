package ejerciciosPracticos;

import java.util.Scanner;

public class PruebaDoWhile {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i = 0;
        int num;
        int suma = 0;
        do {
            System.out.println("Ingrese un número " + (i + 1));
            num = leer.nextInt();
            System.out.println("Número ingresado: " + num);
            if (num == 0) {
                System.out.println("Se capturó el número 0");
                break;
            }
            if (num < 0) {
                i = i + 1;
                continue;
            }
            suma += num;
            i += 1;
            System.out.println("El resultado es " + suma);
        } while (i < 20);
    }

}
