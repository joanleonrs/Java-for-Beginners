package com.edu.cibertec.exception;

/**
* FUENTE: 		https://jarroba.com/excepciones-exception-en-java-con-ejemplos/
* MORE INFO: 	https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html
**/

public class Example1 {
	public static int numerador = 10;
	public static Integer denominador = 0;
	public static float division;

	public static void main(String[] args) {
		System.out.println("ANTES DE HACER LA DIVISI�N");
		try	{
			division = numerador / denominador;
		} catch (ArithmeticException ex) {
			division = 0; // Si hay Excepcion doy el valor '0' al atributo 'division
			System.out.println("Error: " + ex.getMessage());
		} finally {
			System.out.println("Divisi�n: " + division);
			System.out.println("DESPU�S DE HACER LA DIVISI�N");
		}
	}
	
	/**
	 * FUENTE: 
	 * MORE INFO: https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html
	 **/

}
