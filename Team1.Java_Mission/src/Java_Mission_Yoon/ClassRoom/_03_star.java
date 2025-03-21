package Java_Mission_Yoon.ClassRoom;

public class _03_star {

	public static void main(String[] args) {
		
		// 100번 반복
		for (int i = 1; i <= 100; i++) {
			
			// 십의 자리
			int ten = i/10;
			
			// 일의 자리 
			int one = i%10;
			
			
			if ((ten != 0 && ten%3 == 0) && (one != 0 && one%3 == 0 )) {
				System.out.println("**");
			} else if ((ten != 0 && ten%3 == 0) || (one != 0 && one%3 == 0 )) {
				System.out.println("*");
			} else {
				System.out.println(i);
			}
			
		}
		
		
		
		
	}
	
}
