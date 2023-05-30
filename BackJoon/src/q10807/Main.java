package q10807;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] iArray = new int[n];
		int s = 0;
		for (int i = 0; i < n; i++) {
			iArray[i] += sc.nextInt();
		}
		int v = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (iArray[i] == v) {
				s++;
			}
		}
		sc.close();
		System.out.print(s);
	}
}
