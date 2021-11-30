package practicas_21;

import java.util.Scanner;

public class Activity8 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int kilometros, dias_estancia;
		float precio;
		float distancia;
		
		System.out.println("Introduce los km de tu viaje");
		kilometros = keyboard.nextInt();
		System.out.println("Introduce los dias de tu viaje");
		dias_estancia = keyboard.nextInt();

		distancia = kilometros * 0.35f * 2;
		if ((kilometros >= 1000) && (dias_estancia >= 7)) {
			precio = distancia - distancia * 0.30f;
		} else {
			precio = distancia;
		}
		System.out.println("Tu viaje costará " + precio);
	}

}

