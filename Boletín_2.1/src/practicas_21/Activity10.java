package practicas_21;

import java.util.Random;

public class Activity10 {

	public static void main(String[] args) {
		Random random = new Random();

		int valor1, valor2;
		final int num_cartas = 13;
		final int num_palos = 4;

		String carta = "";

		valor1 = random.nextInt(num_cartas) + 1;
		valor2 = random.nextInt(num_palos) + 1;

		switch (valor1) {
		case 1:
			carta += "as";
			break;
		case 2, 3, 4, 5, 6, 7, 8, 9, 10:
			carta += valor1;
			break;
		case 11:
			carta += "Jota";
			break;
		case 12:
			carta += "Rey";
			break;
		case 13:
			carta += "Reina";
			break;
		default:
			break;
		}

		switch (valor2) {
		case 1:
			carta += "\u2660";
			break;
		case 2:
			carta += "\u2663";
			break;
		case 3:
			carta += "\u2665";
			break;
		case 4:
			carta += "\u2666";
			break;
		default:
			break;
		}

		System.out.println("La carta que aparece es un " + carta);

	}


	}

