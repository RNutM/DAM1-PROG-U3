package Ejercicios;

public class Ejercicio17 {
	/**
	 * Diseñar un programa que muestre el producto de los 10 primeros números impares.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int multi = 0;
		for (int i = 1; i < 10; i = i + 2) {
			System.out.println("El impar es: " + i);

			multi = i * i;
			System.out.println("Su producto es: " + multi);
		}
	}
}