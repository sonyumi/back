package q10951;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(;sc.hasNext();) {
			int iA=sc.nextInt();
			int iB=sc.nextInt();	
			System.out.println(iA+iB);
		}
		sc.close();
	}
}
