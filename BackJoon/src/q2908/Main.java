package q2908;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		sc.close();

		String c = "";
		String d = "";
		for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || i >= 0; i--, j--) {
			c += a.charAt(i);
			d += b.charAt(j);
		}
		int n = Integer.parseInt(c);
		int m = Integer.parseInt(d);

		if (n > m) {
			System.out.println(n);
		} else {
			System.out.println(m);
		}

	}
}
