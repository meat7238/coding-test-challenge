package 백준.실버;

import java.util.Arrays;
import java.util.Scanner;

public class x1206_두수의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) num[i] = sc.nextInt();
        int answer = sc.nextInt();
        Arrays.sort(num);
        int pointS = 0, pointE = n - 1, sum, result = 0;
        while (pointS < pointE) {
            sum = num[pointS] + num[pointE];
            if (sum <= answer) {
                pointS++;
                if (sum == answer) result++;
            } else pointE--;
        }
        System.out.println(result);
    }
}
