package Ejercicios;

import java.util.Scanner;

public class Ejercicio24 {
	/**
	 * Dibuja un cuadrado de n elementos de lado utilizando *.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {
		int numero;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el lado del cuadrado: ");
		numero=sc.nextInt();
		for (int i=0;i<numero;i++) {
			for (int j=0;j<numero;j++)
				System.out.print("* ");			
			System.out.println("");
		}	
		sc.close();
	}
}
