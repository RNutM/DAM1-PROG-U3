package Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {
	/**
	 * Pedir 15 números y escribir la suma total. Puedes cambiar la cantidad de números a
	 * introducir en el bucle for (yo he puesto 5 para la prueba).
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int numero = 0;
		int suma = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			suma += numero;
		}

		System.out.println("La suma es: " + suma);

		sc.close();
	}
}