package ejerciciost1;
import java.util.Scanner;

public class EjercicioProgramacion3 {

	public static void main(String[] args) {
		/* We create and initialize the date of birth, current year and
		 * current age user variables. After that we create a variable
		 * of type: "Scanner" to give it a more shorter name. In this
		 * case: "sc". */
		int currentYear, dateOfBirth, currentAge = 0;
		Scanner sc = new Scanner(System.in);
		
		//Then we ask the user his date of birth and save it on memory.
		System.out.print("Introduzca su año de nacimiento: ");
		dateOfBirth = sc.nextInt();
		
		//We ask the user the current year.
		System.out.print("Introduzca el año actual: ");
		currentYear = sc.nextInt();
		
		//We close Scanner because we don't need it anymore.
		sc.close();
		
		//Making a math operation to know the current age of the user.
		currentAge = currentYear - dateOfBirth;
		
		//Printing the result :)
		System.out.println("Su edad actual es de: " + currentAge + " años.");
	}

}
