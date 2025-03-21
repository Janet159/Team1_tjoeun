package Java_Mission_Yoon.ClassRoom;

import java.util.Scanner;

public class _04_star2 {

	// TODO 출력 그림 제 확인 필요
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수 입력
		int N = sc.nextInt();
		
		// 열
		for (int i = 0; i < N; i++) {
			
			// 행
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
