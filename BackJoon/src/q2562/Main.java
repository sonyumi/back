package q2562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] iArr=new int[9];
		
		for(int i =0;i<iArr.length;i++) {
			iArr[i]=sc.nextInt();
		}
		sc.close();
		int max = iArr[0];
		int j = 0;
		for(int i = 0;i<iArr.length;i++) {
			if(max<iArr[i]) {
				max=iArr[i];
				j=i+1;
			}
		}
		if(max==iArr[0]) {
			j=1;
		}
		System.out.println(max);
		System.out.println(j);
	}
}
