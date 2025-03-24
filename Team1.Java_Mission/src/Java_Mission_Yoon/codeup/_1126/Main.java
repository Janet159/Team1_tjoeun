package Java_Mission_Yoon.codeup._1126;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 정수 2개 입력받기
        
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        
        System.out.println(N1 + " + " + N2 + " = " + (N1+N2) );
        System.out.println(N1 + " - " + N2 + " = " + (N1-N2) );
        System.out.println(N1 + " * " + N2 + " = " + (N1*N2) );
        System.out.println(N1 + " / " + N2 + " = " + (N1/N2) );
        System.out.println(N1 + " % " + N2 + " = " + (N1%N2) );
        
        
    sc.close();
    }
}
