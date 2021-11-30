package practicas_21;

import  java.util.Scanner;

public class Activity5 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int nota;
		
		System.out.println("Escriba la nnota del alumno: ");
		nota = keyboard.nextInt();
		
		if (nota >= 0 && nota < 3) {
			
			System.out.println("Muy deficiente ");
				
		} else if (nota == 3 && nota == 4) {
			
			System.out.println("Insuficiente ");
			
		} else if (nota == 5) {
			
			System.out.println("Suficiente ");
				
		} else if (nota == 6) {
			
			System.out.println("Bien ");
			
		} else if (nota == 7 && nota == 8) {
			
			System.out.println("Notable ");
			
		} else if (nota == 9 && nota == 10) {
			
			System.out.println("Sobresaliente ");
			
		} else {
			System.out.println("La nota no es valida ");
		}
			
		
		switch (nota) {
		case 0:
		case 1:
		case 2:
				System.out.println("Muy deficiente ");
				break;
		case 3:
		case 4:
				System.out.println("Insuficiente ");
				break;
		case 5:
				System.out.println("Suficiente ");
				break;	
		case 6:
				System.out.println("Bien ");
				break;
		case 7:
		case 8:
				System.out.println("Notable ");
				break;
		case 9:
		case 10:
				System.out.println("Sobresaliente ");
				break;
		default:
				System.out.println("La nota no es valida");
				
		}
		
	}

}
