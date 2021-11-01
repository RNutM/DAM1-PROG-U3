package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
	/**
	 * Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han
	 * introducido.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0, cont = 0;
		System.out.println("Introduce un número: ");
		n = sc.nextInt();

		while (n >= 0) {
			cont++;
			System.out.println("Introduce otro número: ");
			n = sc.nextInt();
		}
		System.out.println("Has introducido " + cont + " números");
		System.out.println("Has salido del programa");

		sc.close();
	}
}