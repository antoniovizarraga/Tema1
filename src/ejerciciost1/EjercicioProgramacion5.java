package ejerciciost1;
import java.util.Scanner;
import java.lang.Math;

public class EjercicioProgramacion5 {

	public static void main(String[] args) {
		/* Creamos las variables necesarias para calcular la
		 * circunferencia y las inicializamos. */
		double length, radius, area = 0;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		
		// Le pedimos al usuario que introduzca el radio.
		System.out.print("Introduzca el radio de la circunferencia: ");
		
		// Acto seguido el usuario podrá escribir en el teclado.
		radius = sc.nextDouble();
		
		// Calculamos la longitud de la circunferencia.
		length = 2 * Math.PI * radius;

		// Calculamos el área.
		area = Math.PI * Math.pow(radius, 2);
		
		
		
		/* Imprimimos en pantalla cada propiedad correspondiente 
		 * de la circunferencia. */
		System.out.println("Radio: " + radius);
		System.out.println("Área: " + area);
		System.out.println("Longitud: " + length);
		
		// Cerramos el Scanner.
		sc.close();
	}

}
