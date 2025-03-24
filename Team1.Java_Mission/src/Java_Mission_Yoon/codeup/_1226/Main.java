package Java_Mission_Yoon.codeup._1226;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        // 로또 당첨 번호 입력 + 로또 보너스 번호
        int[] arr1 = new int[7];
        
        // 사용자 로또 번호
        int[] arr2 = new int[6];
        
        // 당첨 번호 개수 세는 변수, 보너스 번
        int count = 0;
        int plus = 0;
        
        
        // 입력
        for (int i = 0; i < arr1.length; i++) {
        	arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
        	arr2[i] = sc.nextInt();
        }
        
        
        
        
        // 번호 일치 개수
        for (int i = 0; i < 6; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					count++;
				}
			}
		}
        
        // 보너스 번호 확인 여부
        for (int i = 0; i < arr2.length; i++) {
			if (arr1[6]==arr2[i]) {
				plus++;
			}
		}
        
        
        // 보너스 번호 당첨
        if (count == 5 && plus ==1) {
			System.out.println("2");
		}else {
			// 로또 출력 
			switch (count) {
			case 6: System.out.println("1"); break;
			case 5: System.out.println("3"); break;
			case 4: System.out.println("4"); break;
			case 3: System.out.println("5"); break;
			default: System.out.println("0"); break;
			}
			
		}
        
        
        sc.close();
    }
}
