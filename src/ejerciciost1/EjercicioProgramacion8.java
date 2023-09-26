package ejerciciost1;
import java.util.Scanner;

public class EjercicioProgramacion8 {

	public static void main(String[] args) {	
		// Creamos las variables de nombre y edad.
		String name = "";
		int age = 0;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que introduzca su nombre.
		System.out.print("Introduzca su nombre: ");
		
		// Abrimos el Scanner para la variable name.
		name = sc.nextLine();
		
		// Le pedimos al usuario su edad.
		System.out.print("Introduzca su edad: ");
		
		// Abrimos el Scanner para la variable age.
		age = sc.nextInt();
		
		/* Le decimos al usuario un mensaje con su
		 * correspondiente nombre y edad. */
		System.out.println("\n" + "Hola " + name + ", tienes " + age + " años.");
		
		// Cerramos el Scanner.
		sc.close();
	}

}
