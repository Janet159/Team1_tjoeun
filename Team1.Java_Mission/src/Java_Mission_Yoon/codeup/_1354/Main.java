package Java_Mission_Yoon.codeup._1354;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = a; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			
			}
			System.out.println();
		}
		

		
		
	sc.close();	
	}
	
}
