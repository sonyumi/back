package q2446;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; n > i; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 2 * n - 1; j > 2 * i; j--) {
				System.out.print("*");
			}
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}

			System.out.println();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 2; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 3; j++) {
				System.out.print("*");
			}
//			for (int j = n - 2; j > i; j--) {
//				System.out.print(" ");
//			}
			System.out.println();
		}
	}
}
