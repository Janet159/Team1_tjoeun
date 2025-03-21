package Java_Mission_Yoon.codeup._1443;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 삽입 정렬
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 입력 받기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 삽입 정렬 - 오름차순
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        // 출력
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        

    }
}
