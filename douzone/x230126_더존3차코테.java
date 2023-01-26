package douzone;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
class Graph {

    class Node {
        int number;
        LinkedList<Node> adj;
        boolean marked;
        int status;

        Node(int number) {
            this.number = number;
            this.marked = false;
            this.status = 0;
            adj = new LinkedList<Node>();
        }
    }

    Node[] nodes;

    Graph(int number) {
        nodes = new Node[number + 1];
        for (int i = 1; i <= number; i++) {
            nodes[i] = new Node(i);
        }
    }

    void addEdge(int i1, int i2) {
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];
        if (!n1.adj.contains(n2)) {
            n1.adj.add(n2);
        }
        if (!n2.adj.contains(n1)) {
            n2.adj.add(n1);
        }
    }

    int cal(int k, int i) {
        int sum = 0;
        int reach = k;
        Stack<Node> stack = new Stack<>();
        nodes[i].marked = true;
        if (nodes[i].status == 1) sum++;
        stack.push(nodes[i]);
        reach--;
        while (!stack.isEmpty()) {
            for (Node n : stack.pop().adj) {
                if (n.marked == false) {
                    n.marked = true;
                    if (reach >= 0 && n.status == 1) {
                        sum++;
                    }
                    stack.push(n);
                }
            }
            reach--;
            if (reach < 0) break;
        }
        return sum;
    }
}//end Graph

public class x230126_더존3차코테 {
    static int AnswerN;
    static int N = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            AnswerN = 0;
            N = sc.nextInt(); //교차로 갯수 N
            int K = sc.nextInt(); //거리 K
            Graph g = new Graph(N);
            for (int i = 0; i < N - 1; i++) {
                g.addEdge(sc.nextInt(), sc.nextInt());
            }
            for (int i = 1; i <= N; i++) {
                g.nodes[i].status = sc.nextInt();
            }
            for (int i = 1; i <= N; i++) {
                int result = g.cal(K,i);
//                System.out.println(i+"일때의 계산값: "+result);
                for(int j =1; j<=N; j++) g.nodes[j].marked = false;
                AnswerN += result;
            }
            System.out.println("#" + test_case + " " + AnswerN);
        }//end Test
    }//end Main
}
