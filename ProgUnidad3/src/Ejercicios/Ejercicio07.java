package Ejercicios;

import java.util.Scanner;

public class Ejercicio07 {
	/**
	 * Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca
	 * un número negativo.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int numero = 0;
		int cuadrado = 0;

		Scanner sc = new Scanner(System.in);
		while (numero >= 0) {
			System.out.println("\nIntroduce un número: ");
			numero = sc.nextInt();

			cuadrado = (numero * numero);
			if (numero >= 0)

				System.out.println("El cuadrado del número es: " + cuadrado);
			else
				System.out.println("Has salido del programa");
		}
		sc.close();
	}
}