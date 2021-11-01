package Ejercicios;

public class Ejercicio15 {
	/**
	 * Escribir todos los números del 100 al 0 de 7 en 7.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int n = 100;// Empiezo con n en 100

		while (n >= 7)// Mientras que n sea mayor o igual a 7 continuo el bucle
		{
			System.out.print(n + " ");// Muestro n
			n = n - 7;// Resto 7 a n asi cuento hacia atras de 7 en 7
		}
	}
}