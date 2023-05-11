package q2525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(); //시
		int m = sc.nextInt(); //분
		int tt = sc.nextInt(); //걸리는시간
		sc.close();
		m=m+tt; 
		if(m >= 60) {
			h= h+(m/60); //분이 60이상일때 시간
			m=m%60; // 분이 60이상일때 분
			if(h>=24) {
				h=h-24	; //시가 24시이상일때 0+@으로 초기화
			}
		}
		System.out.println(h+ " "+m);
	}
}
