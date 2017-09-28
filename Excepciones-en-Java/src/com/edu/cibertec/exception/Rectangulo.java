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
       System.out.println("Calcular el Área de un Rectángulo.");
        try {
            System.out.print("Ingrese la base del Rectángulo: ");
            base = numero.nextInt();
            System.out.print("Ingrese la altura del Rectángulo: ");
            altura = numero.nextInt();
            area = base * altura;
            System.out.println("Resultado.");
            System.out.println("El Área resultante es: " + area);
        } catch (Exception e) {
            System.out.print("ERROR de datos...");
        }       
    }
}
