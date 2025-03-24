package Java_Mission_Yoon.codeup._1356;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 정수 입력
        int N = sc.nextInt();
        
        // 열
        for (int i = 0; i < N; i++) {
        	
        	// 행
        	for (int j = 0; j < N; j++) {
        		// 첫행, 마지막행
        		if (i==0 || i == N-1) {
					System.out.print("*");
				}
        		// 나머지 
        		else {
					if (j==0 || j==N-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
        		
        		
			}
        	System.out.println();
        	
		}

        
        
        
        sc.close();
    }
}
