package q2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
//		String b = "";
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
//				System.out.println("i:"+i+" , j:"+j);
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
