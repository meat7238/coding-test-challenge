package 백준.실버;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class x1230_프린터큐 {
    static Scanner sc = new Scanner(System.in);
    static int numberDocuments, checkIndex, answer;
    static Queue<Number> printer;

    static class Number {
        int priority;
        boolean marked;

        Number(int num) {
            this.priority = num;
            marked = false;
        }
    }

    public static void main(String[] args) {
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            numberDocuments = sc.nextInt();
            checkIndex = sc.nextInt();
            printer = new LinkedList<>();
            answer = 1;
            for (int j = 0; j < numberDocuments; j++) {
                Number s = new Number(sc.nextInt());
                if (j == checkIndex) s.marked = true;
                printer.add(s);
            }

            while (!printer.isEmpty()) {
                int max = Integer.MIN_VALUE;
                for (Number n : printer) max = Math.max(max, n.priority);
                if (printer.peek().priority < max) {
                    printer.add(printer.poll());
                } else {
                    if (printer.peek().marked) {
                        System.out.println(answer);
                        break;
                    }
                    printer.poll();
                    answer++;
                }
            }
        }//End T
    }
}
