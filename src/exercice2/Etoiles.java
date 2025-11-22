package exercice2;

import java.util.Scanner;

public class Etoiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez choisir un nobre de lignes: ");
		int lignes = sc.nextInt();
		for (int i = 1; i <= lignes; i++) {
			for (int s = 0; s < lignes - i; s++) {
                System.out.print(" ");
            }
			for (int et = 0; et < 2 * i - 1; et++) {
                System.out.print("*");
            }
			System.out.println();
		}
	}
}
