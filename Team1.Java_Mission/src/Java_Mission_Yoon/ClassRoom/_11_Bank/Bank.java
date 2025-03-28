package Java_Mission_Yoon.ClassRoom._11_Bank;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Account> accounts = new ArrayList<>();
		
		
		
//		생성 순서
		int index=0;
		int index2=0;
		
		
		String tempAccountNum;
		int tempAccountPw;
		int tempAccountMoney;
		int Answer;
		
		int MasterPw = 1111;
		
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
		sc.nextLine();
		
		switch (menuNo) {
		case 1 : 
			Account account = new Account();
			System.out.print("계좌 번호>>");
			account.setAccountNum(sc.nextLine());
			
			System.out.print("예금주>>");
			account.setAccountName(sc.nextLine());
			
			System.out.print("최초예금액>>");
			account.setAccountMoney(sc.nextInt());
			
			System.out.print("비밀번호>>");
			account.setAccountPw(sc.nextInt());
			
			System.out.println("'"+ account.getAccountName()+"' 님의 계좌가 개설되었습니다.");
			
			// accounts 배열에 변수들 넣기
			
			accounts.add(account);
			
			
			index++;
		
			break;
			
		case 2 : 
			System.out.print("계좌번호2>>");
			tempAccountNum = sc.nextLine();
			
			System.out.print("입금액2>>");
			tempAccountMoney = sc.nextInt();
			
			for (Account acc : accounts) {
				if(acc.getAccountNum().equals(tempAccountNum)); {
					System.out.println(acc.getAccountName()+ "님에게 입금하시는게 맞습니까?");
					System.out.println("1. 예");
					System.out.println("2. 아니오");
					
					Answer = sc.nextInt();
					switch (Answer) {
					case 1 : 
						System.out.println(acc.getAccountName()+ "님의 계좌에 " + tempAccountMoney + "원이 입금되었습니다.");
						acc.setAccountMoney(acc.getAccountMoney() + tempAccountMoney);
						
						break;
					
					default: System.out.println("입금이 취소되었습니다.");
					break;
					}
				}break;
			}break;
			
			
		case 3 : {
			System.out.println("=========== 출금 ===========");
			System.out.print("계좌번호3>>");
			tempAccountNum = sc.nextLine();
			
			System.out.print("비밀번호>>");
			tempAccountPw = sc.nextInt();
			
			for (Account acc : accounts) {
				
				if (acc.getAccountNum().equals(tempAccountNum) && acc.getAccountPw() == tempAccountPw) {
					System.out.println(acc.getAccountName() + "님의 잔액은 " + acc.getAccountMoney());
					System.out.print("출금하실 금액>>");
					tempAccountMoney = sc.nextInt();
					
					acc.setAccountMoney(acc.getAccountMoney()-tempAccountMoney);
					System.out.println(acc.getAccountName() + "님의 잔액은 " + acc.getAccountMoney());
				} else {
					System.out.println("계좌 번호 or 비밀번호가 다름니다.");
				}
				
			}
		}break;
		
		
		
		
			
		case 4: {
			System.out.print("계좌번호4>>");
			tempAccountNum = sc.nextLine();
			System.out.print("비밀번호4>>");
			tempAccountPw = sc.nextInt();
		
			// 인덱스 
			for (Account acc : accounts) {
				for (int i = 0; i < accounts.size(); i++) {
					if(acc.getAccountNum().equals(tempAccountNum));
					index2 = i;
				}
				Account foundAccount = accounts.get(index2);
				System.out.println(foundAccount.getAccountName() + "님의 계좌 잔액은 " + foundAccount.getAccountMoney() + "원 입니다.");
				
			
			}
		}break;
			
			
		case 5: {
			System.out.print("관리자비밀번호");
			tempAccountPw = sc.nextInt();
			if (MasterPw == tempAccountPw) {
				System.out.println("예금주\t\t\t계좌번호\t\t\t잔고");
				for ( Account acc : accounts) {
					System.out.println(acc.getAccountName()+ "\t\t\t" + acc.getAccountNum() + "\t\t\t" + acc.getAccountMoney());
				}
			}
		} break;
			
		
		default: System.out.println("올바른 숫자를 입력해주세요 "); break;
		}
			
		} while (true);
		
	}
}
