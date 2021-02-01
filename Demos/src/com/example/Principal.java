package com.example;
/**
 * Ejemplos del curso
 * @author Javier
 *
 */
public class Principal {

	/**
	 * Método principal
	 * @param args Argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		System.out.println(3 / 0);
		System.out.println(3.0 / 0);
	}
	
	/**
	 * Divi ....
	 * @param a Primer operando 
	 * @param b Segundo operando
	 * @return Resultado de la division entera
	 * @throws ArithmeticException Divide by zero
	 */
	public int divide(int a, int b) throws ArithmeticException {
		return a / b;
	}

}
