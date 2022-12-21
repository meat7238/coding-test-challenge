package 백준.실버;

import java.util.Scanner;

public class x1221_기타줄 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int totalSet = Integer.MAX_VALUE;
        int totalEtc = Integer.MAX_VALUE;
        if (N < 6) totalSet = 0;
        int[][] pack = new int[M][2];
        for (int i = 0; i < M; i++) {
            pack[i][0] = sc.nextInt(); // 세트가격
            pack[i][1] = sc.nextInt(); // 낱개가격
            if (N >= 6) totalSet = Math.min(totalSet, Math.min(pack[i][0] * (N / 6), pack[i][1] * 6 * (N / 6)));
            totalEtc = Math.min(totalEtc, Math.min(pack[i][0], pack[i][1] * (N % 6)));
        }
        System.out.println(totalSet + totalEtc);

    }
}
