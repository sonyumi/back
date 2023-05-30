package q10811;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] iArr = new int[n];
		for (int i = 0; i < n; i++) {
			iArr[i] += (i + 1);
		}
		int j = 0;
		for (int i = 0; i < m; i++) {
			int s = sc.nextInt() - 1;
			int k = sc.nextInt() - 1;
			for (; s < k; s++, k--) {
				j = iArr[k];
				iArr[k] = iArr[s];
				iArr[s] = j;
			}
		}
		sc.close();
		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
	}

}
