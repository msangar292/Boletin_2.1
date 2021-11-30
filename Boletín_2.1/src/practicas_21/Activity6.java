package practicas_21;

import java.util.Scanner;

public class Activity6 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		
		System.out.println("Escribe tres numeros");
		num1 = keyboard.nextInt();
		num2 = keyboard.nextInt();
		num3 = keyboard.nextInt();
		
		if(num1 == num2 || num1 == num3) {
			
			if(num1 == num2 && num1 == num3) {
			
			System.out.println("Hay tres numeros iguales a " + num1);
			
		} else {
			
			System.out.println("Hay dos numeros iguales a " + num1);
			
		} 
			
		}else if (num2 == num3) {
			System.out.println("Hay dos numeros iguales a " + num2);
	} else {
		System.out.println("No hay numeros iguales");
	}

}
	
	
}
