package Ejercicios;

public class Ejercicio01 {
	/**
	 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int numero = 5;

		System.out.println("Son multiplos de 5 los siguientes números: \n");
		for (int i = 1; i <= 20; i++)// Para i=1 mientras i sea menor o igual a 20 i=i+1
			System.out.print(+(numero * i) + " ");// Muestro el valor de numero por el valor de i
	}
}