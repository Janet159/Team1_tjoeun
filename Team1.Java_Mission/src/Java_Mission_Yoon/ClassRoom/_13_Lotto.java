package Java_Mission_Yoon.ClassRoom;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


class LottoNeed {
	
	private static LottoNeed instance;
	
	private LottoNeed() {}
	
	public static LottoNeed getInstance() {
		if (instance == null) {
			instance = new LottoNeed();
		}
		return instance;
	}
	
	
	
	public ArrayList randomNum() {
		
		ArrayList<Integer> set1 = new ArrayList<Integer>();
		
		// 랜덤 수 대입 & 중복 제거
		while (set1.size() < 6) {
			int rand = (int) (Math.random()*45 +1);
			set1.add(rand);
			}
		// 스트림을 사용하여 정렬 + 출력
			set1.stream()
				.sorted()
				.forEach(lotto -> System.out.print(lotto + " ") );
		return set1;
	}
	
	public ArrayList randomSelf() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> set2 = new ArrayList<Integer>();
		
			System.out.print("① : ");
			set2.add(sc.nextInt());
			System.out.print("② : ");
			set2.add(sc.nextInt());
			System.out.print("③ : ");
			set2.add(sc.nextInt());
			System.out.print("⑤ : ");
			set2.add(sc.nextInt());
			System.out.print("⑤ : ");
			set2.add(sc.nextInt());
			System.out.print("⑥ : ");
			set2.add(sc.nextInt());
			
			// 출력 
			for (Integer integer : set2) {
				System.out.print(integer + " ");
			}
			
		return set2;
	}
	
	
	
}
	



public class _13_Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LottoNeed lottoNeed = LottoNeed.getInstance();
		ArrayList<ArrayList<Integer>> lottoList = new ArrayList<ArrayList<Integer>>();
		
		// N 게임 수
		System.out.print("몇 게임?");
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i+1) + " 게임] (1.자동 / 2.수동) :");
			int Choice =sc.nextInt();
			if (Choice == 1) {
				lottoList.add();
				lottoList.add(lottoNeed.randomNum());
				System.out.println();
			}
			else {
				lottoList.add(lottoNeed.randomSelf());
			}
			
		}
		
		// 출력 (발행일)
		System.out.println("############ 인생역전 Lottoria #########1###");
		System.out.print("발행일\t:");
		
		// 현재 날짜와 시간 가져오기
        LocalDateTime currentDateTime = LocalDateTime.now();
        
		 // 날짜와 시간을 원하는 형식으로 포맷하기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        String formattedDateTime1 = currentDateTime.format(formatter1);
		
     // 요일 가져오기
        DayOfWeek dayOfWeek = currentDateTime.getDayOfWeek();
        
        // 요일 변수
        String SevenStr="";
        
        // 요일 한글로 변경 
        switch (dayOfWeek) {
		case MONDAY : SevenStr = "월"; break;
		case TUESDAY:  SevenStr = "화"; break;
		case WEDNESDAY:  SevenStr = "수"; break;
		case THURSDAY: SevenStr = "목"; break;
		case FRIDAY:  SevenStr = "금"; break;
		case SATURDAY:  SevenStr = "토"; break;
		case SUNDAY:  SevenStr = "일"; break;
			
		}
        // 현재 날짜, 시간, 요일 출력
        System.out.println(formattedDateTime + "\t(" + SevenStr + ")\t" +formattedDateTime1);
		
		// 출력 - 추첨일 

        // 현재 날짜 및 시간 가져오기
        DayOfWeek today = currentDateTime.getDayOfWeek();
        
        // 이번 주 토요일 계산
        LocalDateTime thisSaturday = currentDateTime
            .plusDays((DayOfWeek.SATURDAY.getValue() - today.getValue() + 7) % 7)
            .withHour(21).withMinute(0).withSecond(0);

     // 현재가 토요일 21시 이후인지 확인
        if (today == DayOfWeek.SATURDAY && currentDateTime.getHour() >= 21) {
            thisSaturday = thisSaturday.plusDays(7);  // 다음주 토요일로 설정
        }

        // 날짜 포맷 설정
        String formattedDateTime2 = thisSaturday.format(formatter);
        String formattedDateTime3 = thisSaturday.format(formatter1);

        // 출력
        System.out.println("추첨일\t:" + formattedDateTime2 + "\t(토)\t" +formattedDateTime3);
        
        // 출력 - 지급기한 
     // 다음 주 월요일(지급일) 계산 (토요일 + 2일)
        LocalDateTime nextMonday = thisSaturday.plusDays(2).withHour(9).withMinute(0).withSecond(0);
        System.out.println("지급일\t:" + nextMonday.format(formatter)+"\t(월)");

        System.out.println("-----------------------------------------");
        for (int i = 0; i < N; i++) {
			System.out.println((char) (65+i));
			if(Chic)
			
			
			
		}
        
	}
	
}
