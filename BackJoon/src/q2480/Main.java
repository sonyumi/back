package q2480;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		int dice1 = (int) (Math.random() * 6) + 1;
//		int dice2 = (int) (Math.random() * 6) + 1;
//		int dice3 = (int) (Math.random() * 6) + 1;
		Scanner sc = new Scanner(System.in);
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		sc.close();
		if (dice1 != dice2 && dice2 != dice3 && dice1 != dice3) {
			// 3개 다 다른눈
			if (dice1 > dice2 && dice1 > dice3) {
				// 1이 클 경우
				System.out.print(dice1 * 100);
			} else if (dice2 > dice1 && dice2 > dice3) {
				// 2가 클경우
				System.out.print(dice2 * 100);
			} else if (dice3 > dice1 && dice3 > dice2) {
				// 3이 클경우
				System.out.print(dice3 * 100);
			}
		} else if (dice1 == dice2 || dice2 == dice3 || dice3 == dice1) {
			// 2개의수 이상이 같은경우
			if (dice1 == dice2 && dice1 != dice3) {
				// 1과 2는 같지만 3은 다른경우
				System.out.print(1000 + (dice2 * 100));
			} else if (dice2 == dice3 && dice1 != dice3) {
				// 2와 3은 같지만 1은 다른경우
				System.out.print(1000 + (dice2 * 100));
			} else if (dice3 == dice1 && dice1 != dice2) {
				// 1과 3은 같지만 2는 다른경우
				System.out.print(1000 + (dice1 * 100));
			} else {
				// 3개의 수가 전부 같은경우
				System.out.print(10000 + (dice1 * 1000));
			}
		}
	}
}
