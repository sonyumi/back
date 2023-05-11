package q10807;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			a[i]+=b;
		}
		System.out.print(a[n]);
	}

}
