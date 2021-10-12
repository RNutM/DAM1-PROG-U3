package Ejercicios;

import java.util.Scanner;

public class Ejercicio19 {
	/**
	 * Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
	 * (Yo hago la prueba con 5 sueldos).
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {
		int cont1 = 0, cont2 = 0;
		float sueldo = 0.0f, suma = 0.0f;
		Scanner sc = new Scanner(System.in);

		while (cont1 < 5) {
			System.out.println("Introduce un sueldo: ");
			sueldo = sc.nextFloat();
			suma = suma + sueldo;
			cont1++;
			if (sueldo > 1000)
				cont2++;
		}
		sc.close();
		System.out.println("La suma de los sueldos es " + suma + "€");
		System.out.println("Hay " + cont2 + " sueldos mayores de 1000€");
	}
}
