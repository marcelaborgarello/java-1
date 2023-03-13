package ejercicios_practicos;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int opcion;
        String salir = "N";

        System.out.println("Ingrese dos numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        while (salir.equalsIgnoreCase("n")) {
            System.out.println("MENU");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija una opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma de los numeros ingresados es = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros ingresados es = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multipliacion de los numeros ingresados es = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La division de los numeros ingresados es = " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa (S/N):");
                    salir = leer.next();
                    break;
                default:
                    System.out.println("El valor ingresado no es válido");
            }

            if (salir.equalsIgnoreCase("s")) {
                break;
            }
        }

    }

}
