package Extras;

public class Test {
	/**
	 * Test para obtener el mensaje de la excepción aritmética by zero cuando dividimos
	 * un número entre 0. Si igualo la variable b a 2 por ejemplo, mostraría el resultado
	 * 5 o si la igualo a 5 mostraría 2, pero siempre que dividamos entre 0 saltará la
	 * excepción. 
	 * 
	 * Con getMessage() obtenemos los valores del error
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int a = 10, b = 0, c;

		try {
			c = a / b;

		} catch (ArithmeticException e) {
			System.out.println("Error. " + e.getMessage()); // Obtiene valores
			return;
		}
		System.out.println("Resultado:" + c);
	}
}
