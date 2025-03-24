package Java_Mission_Yoon.ClassRoom;

import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _09_CountMoney2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 배열로 생성
		
		int[] MoneyStandard = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] MoneyCount = new int[10];
		String name = "";
		String[] nameArr = new String[10];
		int snackMoney = 0;
		int temp = 0;
		Boolean Check = true;

		// 이름, 간식비 입력 받기
		while(Check) {
			for (int i = 0; i < name.length();) {
				nameArr[i] = sc.next();
				if(name.equals("quit")) {
					i++;
					break;
				}
				
			}


			snackMoney = sc.nextInt();
	
			// 돈 계산
			temp = snackMoney;
			for (int i = 0; i < MoneyStandard.length; i++) {
				MoneyCount[i] = temp / MoneyStandard[i];
				temp = snackMoney % MoneyStandard[i];
			}
			
		}
		
		
		
		// 출력
		System.out.println("성명\t출방비\t오만원\t만원\t오천원\t천원\t오백원\t백원\t오십원\t십원\t오원\t일원");
		System.out.print(name + "\t");
		System.out.print(snackMoney + "\t");
		for (int i = 0; i < MoneyCount.length; i++) {
			System.out.print(MoneyCount[i] + "\t");
		}
		System.out.println();
		

		
		System.out.println();
			
		
		sc.close();
	}
	
}
