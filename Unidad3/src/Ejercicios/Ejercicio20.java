package Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
	/**
	 * Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la
	 * cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de
	 * 1.75.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int edad=0, cont1=0, mayor=0, alumnos = 5, altos=0, sumaEdad =0;
		float altura= 0.0f, edadM=0.0f, alturaM = 0.0f, sumaAltura= 0.0f;	
		Scanner sc = new Scanner(System.in);
		
		while (cont1 < alumnos) {
			System.out.println("Introduce un edad: ");
			edad = sc.nextInt();
			System.out.println("Introduce altura: ");
			altura = sc.nextFloat();
			sumaEdad += edad;
			sumaAltura += altura;
			cont1++;
			if (edad >=18)// Los mayores de edad
				mayor++;
			if (altura > 1.75)// Los que superan 1.75
				altos++;
		}
		sc.close();
		edadM = sumaEdad/alumnos;// Edad media alumnos
		alturaM = sumaAltura/alumnos;// Altura media alumnos
		
		System.out.println("La edad media de los alumnos es de "+edadM+" años");
		System.out.println("La altura media de los alumnos es de "+alturaM);
		System.out.println("La cantidad de alumnos mayores de edad es: "+mayor);
		System.out.println("La cantidad de alumnos que superan 1.75 de altura es "+altos);
	}
}
