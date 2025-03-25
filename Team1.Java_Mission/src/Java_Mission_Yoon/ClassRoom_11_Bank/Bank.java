package Java_Mission_Yoon.ClassRoom_11_Bank;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account account = new Account();
		
//		생성 순서
		int index =0;
		
		// 비밀번호 배열
		int[] pw = new int[index];
		
		// 선택
		
		do {
			
		System.out.println("================================");
		System.out.println("1. 계좌등록");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌조회");
		System.out.println("5. 계좌목록");
		System.out.println("6. 종료");
		System.out.println("================================");
		
		int menuNo = sc.nextInt();
		
		switch (menuNo) {
		case 1 : 
			System.out.print("계좌 번호>>");
			account.setAccountN(sc.nextLine());
			System.out.print("예금주>>");
			account.setAccountName(sc.nextLine());
			System.out.print("최초예금액>>");
			account.setAccountMoney(sc.nextInt());
			System.out.print("비밀번호");
			pw[index] = sc.nextInt();
			
			
		default:
		}
			
		} while (true);
		
	}
}
