package Ejercicios;

import java.util.Scanner;

public class Ejercicio25 {
	/**
	 * Realizar un programa que nos pida un número n, y nos diga cuantos números hay
	 * entre 1 y n que son primos.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {
		int contador = 0, numero = 2, N;
		boolean primo = false;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce número: ");
		N = sc.nextInt();

		while (contador != N && numero < N) {
			primo = true;
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0)
					primo = false;
			}
			if (primo) {
				contador++;// Cuento los primos
				System.out.print(numero + " ");
				// ********Block start**********//
				if (contador == 10) {
					System.out.println("\n");
					contador = 0;
				} // **********Block end**********//
			}
			numero++;
		}
		sc.close();
	}
}

/*
 * APUNTE: Si quiero obtener los números primos que hay entre 1 y el número que
 * introduzca el usuario, en el bucle while tengo que poner dos condiciones: 1º que
 * el contador sea distinto de N -> contador ¡=N y 2º que el número sea menor que N
 * -> numero<N así el bucle no para hasta cumplir las dos condiciones.
 * 
 * Por otro lado, si lo que quiero es obtener lo N números primeros que introduce el
 * usuario tan solo tendría que poner la 1º condición -> que el contador sea distinto
 * de N -> contador ¡=N, así obtendría el resultado esperado.
 */