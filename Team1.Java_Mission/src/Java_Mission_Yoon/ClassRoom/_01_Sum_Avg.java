package Java_Mission_Yoon.ClassRoom;

import java.util.Scanner;

public class _01_Sum_Avg {

    public static void main(String[] args) {
        // 변수 입력 받기
        Scanner sc = new Scanner(System.in);
        int eng = sc.nextInt();
        int math = sc.nextInt();
        int java = sc.nextInt();

        // 합계
        int sum = eng + math + java;

        // 평균
        double avg = sum / 3.0; 

        // 출력
        System.out.println("영어점수 : " + eng);
        System.out.println("수학점수 : " + math);
        System.out.println("자바점수 : " +java);
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);
        

    }

}
