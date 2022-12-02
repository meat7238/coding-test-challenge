package 백준.실버;

import java.util.Scanner;

public class x1202_행운의바퀴_2840 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 칸의갯수
        int K = sc.nextInt(); //시행횟수
        String[] wheel = new String[N];
        int position = 0;
        for (int i = 0; i < K; i++) {
            int S = sc.nextInt(); // changes
            String alpha = sc.next();
            int nextNum = cycleCalculator(N, S, position);
            if (wheel[nextNum] != null && !alpha.equals(wheel[nextNum])) {
                System.out.println("!");
                System.exit(0);
            }
            wheel[cycleCalculator(N, S, position)] = alpha;
            position = nextNum;
        }
        for (int i = 0; i < N; i++) {
            if (wheel[i] == null) {
                wheel[i] = "?";
            }
        }
        checkOverlap(wheel);

        for (int i = position; i < wheel.length; i++) {
            System.out.print(wheel[i]);
        }
        for (int i = 0; i < position; i++) {
            System.out.print(wheel[i]);
        }
    }

    private static void checkOverlap(String[] wheel) {
        StringBuilder distiction = new StringBuilder();
        for (String s : wheel) {
            if (s.equals("?")) {
                distiction.append("?");
                continue;
            }
            if (!distiction.toString().contains(s))
                distiction.append(s);
        }
        if (distiction.length() != wheel.length) {
            System.out.println("!");
            System.exit(0);
        }
    }

    private static int cycleCalculator(int size, int changes, int position) {
        int result = position - changes % size;
        if (result < 0) {
            result += size;
        }
        return result;
    }
}
