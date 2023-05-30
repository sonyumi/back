package q10039;

import java.util.Scanner;

public class Main {
	public static int getAvg(int[] score) {
		int avg = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] < 40) {
				score[i] = 40;
			}
			avg += score[i];
		}
		avg = avg / score.length;
		return avg;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}

		sc.close();
		System.out.println(getAvg(score));

	}
}
