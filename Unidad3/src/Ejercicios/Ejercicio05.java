package Ejercicios;

public class Ejercicio05 {
	/**
	 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un
	 * bucle while.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int n = 320;// Empiezo con n en 320

		while (n >= 160) {// Mientras n sea mayor o igual que 160 sigo con el bucle
			System.out.print(n + " ");// Muestro n y sumo un espacio en blanco
			n = n - 20;// n es igual a n menos 20 asi cuento hacia atras de 20 en 20
		}
	}
}