package q25314;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int c = n/4;
		for(int i = 0; i<c;i++) {
			System.out.print("long ");
		}
		System.out.print("int");
	}
}
