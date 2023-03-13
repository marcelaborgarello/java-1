/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author impre
 */
public class ejercico7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las secuencias");
        String cadena = leer.next();
        int correctas = 0;
        int incorrectas = 0;

        int longitud = cadena.length();

        while (!cadena.equals("&&&&&")) {
            if (longitud == 5 && cadena.toLowerCase().startsWith("x") && cadena.toLowerCase().endsWith("o")) {
                correctas++;
            } else {
                incorrectas++;
            }
            System.out.println("Ingrese las secuencias");
            cadena = leer.next();
        }

        System.out.println("Correctas:  " + correctas);
        System.out.println("Inorrectas:  " + incorrectas);

    }

}
