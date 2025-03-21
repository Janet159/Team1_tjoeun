package Java_Mission_Yoon.ClassRoom;

import java.util.Scanner;

public class _05_Menu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int menuNo;
		int count=-1;
		
		// 메뉴판 
		do {
			System.out.println("::::::::: 치킨 메뉴판 :::::::::");
			System.out.println("1. 황금올리브 반반한 치킨");
			System.out.println("2. 뿌잉클 치킨");
			System.out.println("3. 처갓집에서 호식이가 만든 치킨");
			System.out.println("0. 종료");
			System.out.println("::::::::::::::::::::::::::::::");
			System.out.println();
			menuNo = sc.nextInt();
			count++;
			
			if (menuNo == 0) break; 
			switch (menuNo) {
			case 1: System.out.println("'황금올리브 반반한 치킨'이(/가) 주문되었습니다."); break;
			case 2: System.out.println("'뿌잉클 치킨'이(/가) 주문되었습니다."); break;
			case 3: System.out.println("'처갓집에서 호식이가 만든 치킨'이(/가) 주문되었습니다."); break;
			case 0: System.out.println(); break;
			
			
			default: System.out.println("(0~3) 사이의 번호를 입력해주세요. ");
			}
		} while (true);
		
		System.out.println("총 " + count + " 개의 상품이 주문되었습니다.");
		
		
		sc.close();
	}
	
}
