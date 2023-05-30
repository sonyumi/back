package q10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i = 0;i<n;i++) {
			int a = sc.nextInt();
			int[] iArray = new int[n];
			iArray[i]+=a;
			if(a<x) {
				System.out.print(iArray[i]+" ");
			}
		}
		sc.close();
	}
}
