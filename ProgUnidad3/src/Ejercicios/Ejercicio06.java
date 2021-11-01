package Ejercicios;

public class Ejercicio06 {
	/**
	 * Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
	 * do-while
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int x = 320;
		
		do {
			System.out.print(x + " ");
			x = x - 20;
		} while (x >= 160);
	}
}