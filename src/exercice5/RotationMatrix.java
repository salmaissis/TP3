package exercice5;

import java.util.Scanner;

public class RotationMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez choisir la taille de la matrice: ");
		int N = sc.nextInt();
		int[][] A = new int[N][N];
		for (int i = 0; i < N; i++) {
			System.out.println("Veuillez remplir la matrice: " + (i + 1));
			for (int j = 0; j < N; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		rotate90ClockwiseInPlace(A);

		afficherMatrix(A);
	}

	public static void rotate90ClockwiseInPlace(int[][] A) {
		int N = A.length;

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N / 2; j++) {
				int temp = A[i][j];
				A[i][j] = A[i][N - 1 - j];
				A[i][N - 1 - j] = temp;
			}
		}
	}

	public static void afficherMatrix(int[][] A) {
		int N = A.length;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}
}
