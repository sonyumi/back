package q10952;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int iA = sc.nextInt();
			int iB = sc.nextInt();
			if (iA == 0 && iB == 0) {
				sc.close();
				break;
			}
			System.out.println(iA + iB);
		}
	}
}
