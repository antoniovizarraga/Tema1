package ejerciciost1;
import java.util.Scanner;

public class EjercicioProgramacion6 {

	public static void main(String[] args) {
		// Creamos las variables y las inicializamos.
		double val1, val2, result = 0;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Le decimos al usuario que introduzca un valor numérico.
		System.out.print("Introduce el primer valor: ");
		
		/* Usamos el Scanner para que registre el valor 
		 * escrito por el usuario. */
		val1 = sc.nextDouble();
		
		//Le pedimos el segundo valor.
		System.out.print("Introduce el segundo valor: ");
		
		// Usamos el Scanner.
		val2 = sc.nextDouble();
		
		/* Realizamos la operación de suma, y la suma de
		 * los valores lo albergamos en el resultado. */
		result = val1 + val2;
		
		// Imprimimos la suma.
		System.out.println("Suma: " + result);
		
		// Hacemos como la última vez pero restando.
		result = val1 - val2;
		
		// Lo mostramos en pantalla.
		System.out.println("Resta: " + result);
		
		// Multiplicamos.
		result = val1 * val2;
		
		// Lo enseñamos en pantalla.
		System.out.println("Multiplicación: " + result);
		
		// Dividimos.
		result = val1 / val2;
		
		// Lo mostramos.
		System.out.println("División: " + result);
		
		
		// Cerramos el Scanner.
		sc.close();
	}

}
