package 백준.실버;

import java.util.Scanner;

public class x1224_숫자정사각형 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] rec = new int[N][M];
        int size;
        for (int i = 0; i < N; i++) {
            String[] str = sc.next().split("");
            for (int j = 0; j < M; j++) {
                rec[i][j] = Integer.parseInt(str[j]);
            }
        }
        //입력끝

        int square = Math.min(N, M); //초기 정사각형 크기 입력
        while (square-- > 0) {
            for (int i = 0; i < N - square; i++) {
                for (int j = 0; j < M - square; j++) {
                    checkAllSameNumbers(rec[i][j], rec[i][square + j], rec[square + i][j], rec[square + i][square + j], square);
                }
            }
        }
    }

    static void checkAllSameNumbers(int a, int b, int c, int d, int square) {
        if (a == b & a == c & a == d) {
            System.out.println((square + 1) * (square + 1));
            System.exit(0);
        }
    }
}
