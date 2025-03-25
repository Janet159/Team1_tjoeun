package Java_Mission_Yoon.ClassRoom;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _09_CountMoney2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 화폐 단위 배열
        int[] MoneyStandard = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

        // 배열 리스트 초기화
        String[] nameArr = new String[100]; // 최대 100명 가정
        int[] snackMoney = new int[100];
        int[][] MoneyCount = new int[nameArr.length][MoneyStandard.length]; 
        int[] MoneyCountSum = new int[MoneyStandard.length];

        int index = 0; // 데이터 개수

        // 입력을 계속 받는 반복문
        while (true) {
            String input = sc.nextLine();

            // quit 입력 시 반복 종료
            if (input.equals("quit")) {
                break;
            }

            // StringTokenizer 사용
            StringTokenizer stringTokenizer = new StringTokenizer(input, " ");



            // 데이터를 배열에 저장
            while (stringTokenizer.hasMoreTokens()) {
                nameArr[index] = stringTokenizer.nextToken();
                snackMoney[index] = Integer.parseInt(stringTokenizer.nextToken()); 
                index++;
            }
        }

        // 화폐 매수 계산
        for (int i = 0; i < index; i++) {
            int Start = snackMoney[i];

            for (int j = 0; j < MoneyStandard.length; j++) {
                MoneyCount[i][j] = Start / MoneyStandard[j]; 
                Start %= MoneyStandard[j]; 
            }
        }

        // 결과 출력
        System.out.println("\n성명\t출방비\t오만원\t만원\t오천원\t천원\t오백원\t백원\t오십원\t십원\t오원\t일원");
        for (int i = 0; i < index; i++) {
            System.out.print(nameArr[i] + "\t" + snackMoney[i] + "\t");
            for (int j = 0; j < MoneyStandard.length; j++) {
                System.out.print(MoneyCount[i][j] + "\t");
            }
            System.out.println();
        }

        // 전체 화폐 매수 계산
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < MoneyStandard.length; j++) {
                MoneyCountSum[j] += MoneyCount[i][j];
            }
        }

        // 전체 화폐 매수 출력
        System.out.print("전체화폐매수 : \t");
        for (int i = 0; i < MoneyCountSum.length; i++) {
            System.out.print(MoneyCountSum[i] + "\t");
        }

        sc.close();
    }
}


