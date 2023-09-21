package ejerciciost1;
import java.util.Scanner;

public class EjercicioProgramacion4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float firstValue, secondValue, result = 0;
		
		
		System.out.print("Introduzca tu nota: ");
		firstValue = sc.nextFloat();
		
		System.out.print("Introduzca la segunda nota: ");
		secondValue = sc.nextFloat();
		
		sc.close();
		
		result = (firstValue + secondValue) / 2;
		
		System.out.print("La media de tu nota es: " + result);
	}

}
