package Java_Mission_Yoon.ClassRoom;

import java.util.Random;
import java.util.Scanner;

public class _06_Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1~45 숫자 생성
		Random random = new Random();
		
		// 1차원 배열
		int[] arr = new int[6];
		
		// N 게임 수
		int N = sc.nextInt();
		
		
		// N 개 판수 생성 (열)
		for (int i = 1; i <= N; i++) {
			System.out.print("[" + i + " 게임] : "  ) ;
			
			// 숫자 6개 뽑기 및 배열에 넣기(행)
			for (int j = 0; j < 6; j++) {
				arr[j] = random.nextInt(45)+1;
				
				// 중복 제거
		        // 버블 정렬 - 오름차순
		        for (int i1 = 0; i1 < 6; i1++) {
		        	// 오름차순
		            for (int j1 = 0; j1 < 6 - i1 - 1; j1++) {
		                if (arr[j1] >= arr[j1 + 1]) {
		                    int temp = arr[j1];
		                    arr[j1] = arr[j1 + 1];
		                    arr[j1 + 1] = temp;
		                } 
		                // 중복 제거 
		                else if (arr[j1] == arr[j1+1]) {
		                	j--;
		                }
		            }
		            
		            
		        }				
				
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}

		
		sc.close();
	}
}
