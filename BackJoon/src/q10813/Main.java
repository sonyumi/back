package q10813;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			b[i] += (i + 1);
		}

		for (int i = 0; i < m; i++) {
			int j = sc.nextInt();
			int k = sc.nextInt();
			int s = 0;
			s = b[j - 1];
			b[j - 1] = b[k - 1];
			b[k - 1] = s;
		}
		sc.close();
		for (int i = 0; i < n; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
