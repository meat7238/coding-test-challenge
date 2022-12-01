package 백준.실버;

import java.util.Scanner;

public class x1201_BABBA_9625 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int a = 1, b=0,tmp=0;
        for(int i = 0; i<K; i++){
            tmp=a;
            a=b;
            b+=tmp;
        }
        System.out.println(a + " "+ b);
    }
}
