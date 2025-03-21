package Java_Mission_Yoon.ClassRoom;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _09_CountMoney {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력 받음
		String str = sc.nextLine();
	
		// StringTokenizer 활용해 " " <- 공백을 기준으로 분류
		StringTokenizer tokenizer = new StringTokenizer(str, " ");
		
		while (tokenizer.hasMoreElements()) {
			System.out.println();
		}
		
		
		
	}
	
}
