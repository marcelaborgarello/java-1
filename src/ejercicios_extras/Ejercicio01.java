package ejercicios_extras;


import java.util.Scanner;

//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
//ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
//equivalente: 1 día, 2 horas.
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingres al tiempo en minutos");
        int min = leer.nextInt();
        int dia = 0;
        int horas;

        while (min >= 1440) {
            min -= 1440;
            dia += 1;
            horas = min / 60;
            if (horas >= 24) {
                dia += 1;
                horas -= 24;
            }
            min = min % 60;

            System.out.println(dia + "d " + horas + "h " + min + "m");
        }
    }

}
