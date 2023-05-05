package q2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int d = ((b / 100) * 100); // 300
		int z = ((b / 10) - ((b / 100) * 10)) * 10; // 80
		int a1 = a * (b / 100);
		int a2 = a * ((b / 10) - ((b / 100) * 10));
		int a3 = a * (b - d - z);
		System.out.println(a3);
		System.out.println(a2);
		System.out.println(a1);
		System.out.println(a * b);
	}
}
