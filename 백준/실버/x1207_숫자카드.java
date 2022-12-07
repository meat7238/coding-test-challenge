package 백준.실버;

import java.util.Arrays;
import java.util.Scanner;

public class x1207_숫자카드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] number = new int[N];
        for (int i = 0; i < N; i++) {
            number[i] = sc.nextInt();
        }
        Arrays.sort(number);
        int M = sc.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int start = 0, end = N - 1, mid, check = 0;
            int answer = sc.nextInt();
            while (start <= end) {
                mid = (start + end) / 2;
                if (number[mid] == answer) {
                    result.append("1 ");
                    check++;
                    break;
                } else if (number[mid] < answer) start = mid + 1;
                else if (number[mid] > answer) end = mid - 1;
            }
            if (check == 0) result.append("0 ");
        }
        System.out.println(result.substring(0, result.length() - 1));
    }
}
