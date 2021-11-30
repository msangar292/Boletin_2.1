package practicas_21;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int number1;
		int number2;
		
		
		System.out.println("escriba un numero: ");
		number1 = keyboard.nextInt();
		System.out.println("escriba otro numero: ");
		number2 = keyboard.nextInt();
		if (number1 % number2 == 0) {
			System.out.println("el primer numero es multiplo del segundo ");
		} else {
			System.out.println("los numeros no son multiplos ");
		}
		
		
		
	}

}
