package q3052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iArr[] = new int[10];
		for (int i = 0; i < iArr.length; i++) {
			int a = sc.nextInt();
			iArr[i] += a % 42;
		}
		sc.close();
		int count=0;
		int a = 0;
		int[] iBrr=new int[42];
		for(int i = 0;i<iBrr.length;i++) {
			for(int j =0;j<iArr.length;j++) {
				if(i==iArr[j]) {
					count++;
				}
			iBrr[i]+=count;
			count=0;
			if(iBrr[i]!=0) {
				a++;
			}
		}
		System.out.println(a);
	}
}
}x
