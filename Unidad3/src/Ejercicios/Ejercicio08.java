package Ejercicios;

import java.util.Scanner;

public class Ejercicio08 {
	/**
	 * Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta
	 * que se introduzca un 0
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int numero = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número: ");
		numero = sc.nextInt();

		while (numero != 0) {

			if (numero >= 0)
				System.out.println("El número " + numero + " es positivo");
			else
				System.out.println("El número " + numero + " es negativo");
			System.out.println("Introduce otro número: ");
			numero = sc.nextInt();
		}
		System.out.println("Has salido del programa");

		sc.close();
	}
}