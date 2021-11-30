package practicas_21;

import java.util.Scanner;
import java.util.Random;

public class Activity9 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);
		String palabra;
		
		System.out.println("Escribe una palabra: ");
		palabra = keyboard.nextLine();
		
		int caracter = random.nextInt(palabra.length());
		
		System.out.println("El carácter es " + palabra.charAt(caracter) + " se encuentra en la posicion " + caracter);

	}

}
