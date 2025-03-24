package Java_Mission_Yoon.ClassRoom;

import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _09_CountMoney {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 화폐 배열 
		int[] MoneyStandard = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		// 성명, 간식비, 화폐 매수 저장
		String[] nameArr = new String[5];
		int[] SnackMonsey = new int[5];
		int[][] RestMoney = new int[5][10];
		int temp=0;
		
		
		// 성명, 간식비 입력 받음
		for (int i = 0; i < RestMoney.length; i++) {
			nameArr[i] = sc.next();
			if(nameArr[i].equals("quit"))
				break;
			SnackMonsey[i] = sc.nextInt();
		}
		
		//TODO
		// 돈 계산
		for (int i = 0; i < SnackMonsey.length; i++) {
			for (int j = 0; j < MoneyStandard.length; j++) {
				temp = SnackMonsey[j];
				RestMoney[i][j] = temp/MoneyStandard[j];
				temp = SnackMonsey[j]%MoneyStandard[j];
				
			}
			
		}
		
		
		
		// 출력
		System.out.println("성명\t 출방비\t 오만원\t 만원\t 오천원\t 천원\t 오백원\t 백원\t 오십원\t 십원\t 오원\t 일원");
		
		
		// 성명 + 간식비
		for (int i = 0; i < RestMoney.length; i++) {
			System.out.print(nameArr[i] + "\t");
			System.out.print(SnackMonsey[i]+ "\t");
			for (int j = 0; j < RestMoney.length; j++) {
				System.out.print(RestMoney[i][j]+ "\t");
			}
			System.out.println();
		}
		
		// 화폐 계산 
		
		
		
			
		
		sc.close();
	}
	
}
