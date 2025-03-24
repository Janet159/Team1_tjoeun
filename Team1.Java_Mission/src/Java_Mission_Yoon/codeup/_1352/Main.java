package Java_Mission_Yoon.codeup._1352;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수 입력
		int N = sc.nextInt();
		
		// 반복 출력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		sc.close();
	}
}
