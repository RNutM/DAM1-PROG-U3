package Ejercicios;

import java.util.Scanner;

public class Ejercicio21 {
	/**
	 * Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int numero = 0, cont1 = 0, cont2 = 0, cont3 = 0;
		Scanner sc = new Scanner(System.in);

		while (cont1 < 5) {
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			cont1++;
			
			if(numero<0) cont2++;
			else cont3++;
		}
		sc.close();
		System.out.println("La cantidad de números negativos introducidos es: " + cont2);
		System.out.println("La cantidad de números positivos introducidos es: " + cont3);
	}
}
