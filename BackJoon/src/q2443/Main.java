package q2443;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for(int i =n;0<i;i--) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int j =0;2*i-1>j;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
