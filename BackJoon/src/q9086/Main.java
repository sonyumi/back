package q9086;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] s = new String[t];
		for (int i = 0; i < t; i++) {
			s[i] = sc.next();
			System.out.println(s[i].charAt(0) + "" + s[i].charAt(s[i].length() - 1));
		}
		sc.close();
	}
}
