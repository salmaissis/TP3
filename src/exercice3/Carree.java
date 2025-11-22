package exercice3;

import java.util.Scanner;

public class Carree {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez choisir la taille du tableau: ");
		int longueur = sc.nextInt();
		int[] tab = new int[longueur];
		int imp = 1;
		for (int i = 0; i < longueur; i++) {
			tab[i] = imp * imp;
			System.out.println(imp + " a pour carre " + tab[i]);
			imp += 2;
		}
	}

}
