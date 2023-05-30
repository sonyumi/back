package q3040;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] iArr = new int[9];
		int sum = 0;
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = sc.nextInt();
			sum += iArr[i];
		}
		sc.close();
		for (int i = 0; i < iArr.length - 1; i++) {
			for (int j = 1; j < iArr.length; j++) {
				if ((sum - (iArr[i] + iArr[j])) == 100) {
					iArr[i] -= iArr[i];
					iArr[j] -= iArr[j];
					j = 10;
					i = 10;
					break;
				}
			}
		}
		for (int i = iArr.length - 1; i >= 0; i--) {
			if (iArr[i] != 0) {
				System.out.println(iArr[i]);
			}
		}
	}
}
