package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
	/**
	 * Pedir un número N, y mostrar todos los números del 1 al N.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int numero = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();

		if (numero >= 1) {
			for (int i = 1; i <= numero; i++) {
				System.out.print(i + " ");
			}
		}
		System.out.println("Has salido del programa");
		sc.close();
	}
}
