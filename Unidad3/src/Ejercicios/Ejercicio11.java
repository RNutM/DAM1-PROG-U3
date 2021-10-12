package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
	/*
	 * Realizar un juego para adivinar un número. Para ello generar un número N aleatorio
	 * entre 1 y 20, y luego ir pidiendo números indicando “mayor” o “menor” según sea
	 * mayor o menor con respecto a N. El proceso termina cuando el usuario acierta
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Genero un número aleatorio del 1 al 20
		int secreto = (int) (Math.random() * 20) + 1;
		// System.out.println("El número secreto generado es el "+secreto);
		int numero = 0;

		do {
			System.out.println("Introduce un número del 1 al 20: ");
			numero = sc.nextInt();

			if (numero > secreto)// Si número es mayor que secreto
				System.out.println("El número secreto es menor");

			if (numero < secreto)// Si número es menor que secreto
				System.out.println("El número secreto es mayor");

		} while (numero != secreto);// Mientras el número es distinto del secreto vuelve

		System.out.println("El número correcto, enhorabuena");

		sc.close();
	}
}