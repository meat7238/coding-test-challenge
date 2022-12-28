package 백준.실버;

import java.util.Scanner;
import java.util.Stack;

public class x1228_괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String[] str = sc.next().split("");
            Stack<String> vps = new Stack<>();
            try {
                for (String s : str) {
                    if (s.equals("(")) vps.push("(");
                    else if (s.equals(")")) {
                        vps.pop();
                    }
                }
                if (vps.isEmpty()) System.out.println("YES");
                else System.out.println("NO");
            } catch (Exception e) {
                System.out.println("NO");
            }
        }
    }
}
