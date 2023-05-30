package q1546;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] score=new double[n];
		double max = 0;
		for(int i = 0;i<n;i++) {
			score[i]=sc.nextInt();
			if(score[i]>max) {
				max=score[i];
			}
		}
		sc.close();
		double sum=0;
		for(int i = 0;i<n;i++) {
			score[i]=score[i]/max*100;
			sum+=score[i];
		}
		double avg = sum/n;
		System.out.println(avg);
	}
}
