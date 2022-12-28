package 백준.실버;

import java.util.Scanner;

public class x1227_게임을만든동준이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];
        int result = 0;

        for(int i = 0; i<N; i++){
            score[i] = sc.nextInt();
        }
        int before = score[N-1];
        for(int i = N-2; i>=0; i--){
            while(score[i] >= before){
                score[i]--;
                result++;
            }
            before = score[i];
        }
        System.out.println(result);
    }
}
