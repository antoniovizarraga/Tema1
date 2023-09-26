package ejerciciost1;
import java.util.Scanner;

public class EjercicioProgramacion7 {

	public static void main(String[] args) {
		// Creamos e inicializamos las variables.
		String name, street, number = "";
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Le decimos al usuario que introduzca su nombre.
		System.out.print("Introduzca su nombre: ");
		
		// Abrimos el Scanner para que pueda introducir su nombre.
		name = sc.nextLine();
		
		// Le pedimos su calle.
		System.out.print("Inroduzca su calle: ");
		
		// Abrimos el Scanner para pedirle su dirección.
		street = sc.nextLine();
		
		// Le pedimos su número.
		System.out.print("Introduzca su número de teléfono: ");
		
		// Dejamos que el usuario la introduzca usando el Scanner.
		number = sc.nextLine();
		
		
		// Imprimimos un mensaje con su nombre, dirección y número de teléfono.
		System.out.println("\n" + "Nombre: " + name + "\n" + "Dirección: " + street + "\n" + "Teléfono: " + number);

		// Finalmente cerramos el Scanner.
		sc.close();
	}

}
