package Ejercicios;

public class Ejercicio02 {
	/**
	 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int numero = 5;
		int i = 1;

		System.out.println("Son multiplos de 5 los siguientes números: ");
		System.out.println("");

		while (i < 21) {
			System.out.print(+(numero * i) + " ");
			System.out.print("");
			i++;
		}
	}
}