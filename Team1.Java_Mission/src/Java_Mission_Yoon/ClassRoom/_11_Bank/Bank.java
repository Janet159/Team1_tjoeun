package Java_Mission_Yoon.ClassRoom._11_Bank;


import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		
		//TODO 
//		ArrayList<String> personalInformation = new ArrayList<String>();
		
//		생성 순서
		int index=0;
		
		// 비밀번호 배열
		int[] pw = new int[1000];
		
		
		// 기본 출력 
		do {
			
		System.out.println("================================");
		System.out.println("1. 계좌등록");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌조회");
		System.out.println("5. 계좌목록");
		System.out.println("6. 종료");
		System.out.println("================================");
		
		// 선택
		System.out.print("입력>>");
		int menuNo = sc.nextInt();
		
		switch (menuNo) {
		case 1 : 
			System.out.print("계좌 번호>>");
			account.setAccountNum(sc.nextLine());
			sc.nextLine();
			
			System.out.print("예금주>>");
			account.setAccountName(sc.nextLine());
			
			System.out.print("최초예금액>>");
			account.setAccountMoney(sc.nextInt());
			
			System.out.print("비밀번호>>");
			pw[index] = sc.nextInt();
			
			System.out.println("'"+ account.getAccountName()+"' 님의 계좌가 개설되었습니다.");
			
			index++;
			
		
			
			
		default:
		}
		sc.close();
			
		} while (true);
		
	}
}
