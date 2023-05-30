package q10809;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int count = 0;
		for (int i = 97; i < 123; i++) {
			count = -1;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == (char) i && count == -1) {
					count = j;
				}
			}
			System.out.print(count + " ");
		}
	}
}
