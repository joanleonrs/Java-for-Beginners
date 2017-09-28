package com.edu.cibertec.exception;

import java.util.Scanner;

/**
 * @author jleon
 *
 */
public class Rectangulo {

    public static void main(String[] args) {
       int base = 0;
       int altura = 0;
       int area = 0;       
       Scanner numero = new Scanner(System.in);
       System.out.println("Calcular el �rea de un Rect�ngulo.");
        try {
            System.out.print("Ingrese la base del Rect�ngulo: ");
            base = numero.nextInt();
            System.out.print("Ingrese la altura del Rect�ngulo: ");
            altura = numero.nextInt();
            area = base * altura;
            System.out.println("Resultado.");
            System.out.println("El �rea resultante es: " + area);
        } catch (Exception e) {
            System.out.print("ERROR de datos...");
        }       
    }
}
