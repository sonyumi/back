package q5597;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] iArr = new int[30];
		int m = 0;
		for (int i = 0; i < 28; i++) {
			m = sc.nextInt();
			for (int j = 1; j <= iArr.length; j++) {
//				if (m == j) {
//					iArr[j - 1] = m;
//				}
				iArr[j - 1] = m == j ? m : iArr[j - 1];
			}
		}
		sc.close();
		for (int i = 0; i < iArr.length; i++) {
			if (iArr[i] == 0) {
				System.out.println(i + 1);
			}

		}
	}
}
