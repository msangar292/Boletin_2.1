package practicas_21;

import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int number;
		
		System.out.println("Introduce un numero: ");
		number = keyboard.nextInt();
		if (number >= 1) {
			System.out.println("El numero es positivo");
		} if(number <= -1) {
			System.out.println("el numero es negativo");
		} if (number == 0) {
			System.out.println("el numero es 0");
		}
		
		
	}

}
