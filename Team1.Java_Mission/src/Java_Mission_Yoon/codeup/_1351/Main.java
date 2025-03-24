package Java_Mission_Yoon.codeup._1351;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 구구단 출력 
		
		// 정수 2개 입력
		int S = sc.nextInt();
		int E = sc.nextInt();
		
		
//		// 시작 단
//		
//		for (int i = 1; i < 10; i++) {
//			System.out.print("2*" + i + "=" + i*2);
//			System.out.println();
//		}
		
		// S 부터 E 까지 반복
		for (int i = S; i <= E; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.println();
			}
		}
		
		
		
		sc.close();
	}
}
