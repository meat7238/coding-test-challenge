package 백준.실버;

import java.util.Arrays;
import java.util.Scanner;

public class x1920_수찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] number = new int[N];

        for (int i = 0; i < N; i++) {
            number[i] = sc.nextInt();
        }
        Arrays.sort(number);
        int M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            int check = sc.nextInt();
            int lo = 0, hi = N - 1, answer = 0;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (number[mid] == check){
                    answer = 1;
                    break;
                }else if(number[mid] < check){
                    lo = mid+1;
                }else if(number[mid] > check){
                    hi = mid-1;
                }
            }
            System.out.println(answer);
        }

    }
}
