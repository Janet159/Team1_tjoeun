package Java_Mission_Yoon.ClassRoom;

import java.util.Random;
import java.util.Scanner;

public class _06_Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1~45 숫자 생성
		Random random = new Random();
		
		// N 게임 수
		int N = sc.nextInt();
		
		int num;
		
		// N 개 판수 생성
		
		for (int i = 1; i <= N; i++) {
			System.out.print("[" + i + " 게임] : "  ) ;
			
			// 숫자 6개 뽑기
			for (int j = 0; j < 6; j++) {
				num = random.nextInt(45);
				System.out.print(num + " ");
			}
			System.out.println();
		}

		
		sc.close();
	}
}
