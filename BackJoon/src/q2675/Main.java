package q2675;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int k = 0;k<n;k++) {
			int r = sc.nextInt();
			String s = sc.next();
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < r; j++) {
					System.out.print(s.charAt(i));
				}
			}
			sc.close();
			System.out.println();
		}
	}
}
