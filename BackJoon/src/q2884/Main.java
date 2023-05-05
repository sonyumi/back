package q2884;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		m = m - 45;
		if (m < 0) {
			m = m + 60;
			if (h == 0) {
				h = 24 - 1;
			} else {
				h = h - 1;
			}
			System.out.println(h + " " + m);
		} else {
			System.out.println(h + " " + m);
		}
	}
}
