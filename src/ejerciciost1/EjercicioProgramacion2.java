package ejerciciost1;
import java.util.Scanner;

public class EjercicioProgramacion2 {

	public static void main(String[] args) {
		int age = 0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Introduzca su edad: ");
		age = sc.nextInt();
		
		
		age++;
		
		System.out.println("En el próximo año tendrás " + age + " años.");
		
		sc.close();
	}

}
