package q10818;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] iArray = new int[n];

		for (int i = 0; i < n; i++) {
			iArray[i] = sc.nextInt();
		}

		int max = iArray[0];
		int min = iArray[0];

		for (int i = 0; i < n; i++) {
			if (iArray[i] > max) {
				max = iArray[i];
			} else if (iArray[i] < min) {
				min = iArray[i];
			}
		}
		sc.close();

		System.out.print(min + " " + max);
	}
}
