package com.edu.cibertec.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
* FUENTE: 		http://puntocomnoesunlenguaje.blogspot.pe/2014/04/java-excepciones.html
* MORE INFO: 	https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html
**/

public class Numeros2 {
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int n1, n2;
	     try {
	            System.out.print("Introduce un número: ");
	            n1 = sc.nextInt();
	            try {
	                    System.out.print("Introduce otro número: ");
	                    n2 = sc.nextInt();
	                    System.out.println(n1 + " / " + n2 + " = " + n1/(double)n2);
	            }catch (InputMismatchException e) {
	                       sc.nextLine();
	                       n2 = 0;
	                       System.out.println("Debe introducir un número");
	            }catch (ArithmeticException e) {
	                       sc.nextLine();
	                       n2 = 0;
	                       System.out.println("No se puede dividir por cero");
	            }
	     }catch (InputMismatchException e) {
	                sc.nextLine();
	                n1 = 0;
	                System.out.println("Debe introducir un número");
	     }
	}
}
