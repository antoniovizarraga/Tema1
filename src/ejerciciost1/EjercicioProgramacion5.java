package ejerciciost1;
import java.util.Scanner;
import java.lang.Math;

public class EjercicioProgramacion5 {

	public static void main(String[] args) {
		double length, radius, area = 0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Introduzca el radio de la circunferencia: ");
		radius = sc.nextFloat();
		
		sc.close();
		
		length = 2 * Math.PI * radius;
		Math.pow(radius, 2);
		area = Math.PI * radius;
		
		System.out.println("Radio: " + radius);
		System.out.println("Área: " + area);
		System.out.println("Longitud: " + length);
	}

}
