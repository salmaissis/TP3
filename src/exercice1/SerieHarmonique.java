package exercice1;

import java.util.Scanner;

public class SerieHarmonique {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez choisir un nombre: ");
		int nbr = sc.nextInt();
		double somme = 0;

		for (int i = 1; i <= nbr; i++) {
			somme = somme + 1.0 / i;
		}
		System.out.println("la somme des n premiers termes de la série harmonique: " + somme);
	}
}
