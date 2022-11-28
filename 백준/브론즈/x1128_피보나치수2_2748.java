package 백준.브론즈;

import java.util.Scanner;

public class x1128_피보나치수2_2748 {
    static long[] number;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        number = new long[n + 1];
        System.out.println(fibo(n));
    }

    private static long fibo(int num) {
        if (number[num] != 0) return number[num];
        if (num == 0) return 0;
        if (num == 1) return 1;
        if (num == 2) return 1;
        number[num] = fibo(num - 1) + fibo(num - 2);
        return number[num];
    }
}
