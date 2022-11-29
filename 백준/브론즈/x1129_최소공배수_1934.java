package 백준.브론즈;

import java.util.Scanner;

public class x1129_최소공배수_1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
        int a = sc.nextInt(), b = sc.nextInt();
        int gcdA = a, gcdB = b;
            while (gcdB!=0){
                int temp = gcdA%gcdB;
                gcdA = gcdB;
                gcdB = temp;
            }
            System.out.println(a*b/gcdA);
        }
    }
}
