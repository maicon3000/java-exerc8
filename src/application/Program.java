package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();
		int c = sc.nextInt();
		int[][] mat = new int[l][c];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("POSITION: " + i + ", " + j);
					if (j > 0) {
						System.out.println("LEFT: " + mat[i][j - 1]);
					} else {
						System.out.println("LEFT: DOES NOT EXIST");
					}
					if (j < mat[i].length-1) {
						System.out.println("RIGHT: " + mat[i][j + 1]);
					} else {
						System.out.println("RIGHT: DOES NOT EXIST");
					}
					if (i > 0) {
						System.out.println("UP: " + mat[i - 1][j]);
					} else {
						System.out.println("UP: DOES NOT EXIST");
					}
					if (i < mat.length-1) {
						System.out.println("DOWN: " + mat[i + 1][j]);
					} else {
						System.out.println("DOWN: DOES NOT EXIST");
					}
					System.out.println();
				}
			}
		}
		sc.close();
	}

}
