package com.edu.cibertec.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
* FUENTE: 		http://puntocomnoesunlenguaje.blogspot.pe/2014/04/java-excepciones.html
* MORE INFO: 	https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html
**/

public class Numeros1 {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int n;
	      do{
	           try{
	                 System.out.print("Introduce un número entero > 0: ");
	                 n = sc.nextInt();
	                 System.out.println("Número introducido: " + n);
	          }catch(InputMismatchException e){
	                       sc.nextLine();
	                       n = 0;
	                       System.out.println("Debe introducir un número entero " + e.toString());
	          }
	      }while(n<=0);
	}
}
