package q1152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		sc.close();
		String[] sArr = S.split(" ");
		int count = 0;
		for (int i = 0; i < sArr.length; i++) {
			if (sArr[i] != "") {
				count++;
			}
		}
		System.out.println(count);
	}

}
