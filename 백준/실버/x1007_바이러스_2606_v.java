package 백준.실버;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class x1007_바이러스_2606_v {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Graph0 g = new Graph0(sc.nextInt());
	int r = sc.nextInt();
	for(int i=0; i<r;i++) {
		g.join(sc.nextInt(), sc.nextInt());
	}
	g.dfs(1);
}
}

class Graph0{
	static class com{
		int value;
		boolean marked;
		LinkedList<com> adj;
		
		com(int num){
			value = num;
			this.marked = false;
			adj = new LinkedList<com>();
		}
	}
	
	com[] coms;
	int cnt=0;
	Graph0(int num){
		coms = new com[num+1];
		for (int i = 0; i<=num; i++) {
			coms[i] = new com(i);
		}
	}
	
	void join(int a, int b){
		com c1 = coms[a];
		com c2 = coms[b];
		
		if(!c1.adj.contains(c2)) c1.adj.add(c2);
		if(!c2.adj.contains(c1)) c2.adj.add(c1);
	}
	
	void dfs(int st) {
		Stack<com> stack = new Stack<>();
		coms[st].marked = true;
		cnt++;
		stack.push(coms[st]);
		while(!stack.empty()) {
			com test = stack.pop();
			for(com t : test.adj) {
				if(t.marked==false) {
					t.marked = true;
					cnt++;
					stack.push(t);
				}
			}
		}
		System.out.println(cnt-1);
	}
	
	
}







//public class x1007_바이러스_2606 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		function f  = new function(sc.nextInt());
//		int pair = sc.nextInt();
//		for(int i = 0 ; i < pair ; i++) {
//			f.adjxy(sc.nextInt(), sc.nextInt());
//			
//		}
//		
//		f.dfs(1);
//		System.out.println(f.cnt);
//	}
//}
//
//class function {
//	class com {
//		int value;
//		boolean cntmark;
//		LinkedList<com> adj;
//
//		com(int value) {
//			this.value = value;
//			this.cntmark = false;
//			this.adj = new LinkedList<com>();
//		}
//	}
//
//	com[] coms;
//	int cnt;
//
//	function(int computer_num) {
//		coms = new com[computer_num+1];
//		for (int i = 1; i <= computer_num; i++) {
//			coms[i] = new com(i);
//		}
//	}
//
//	void adjxy(int x, int y) {
//		com c1 = coms[x];
//		com c2 = coms[y];
//
//		if (!c1.adj.contains(c2))
//			c1.adj.add(c2);
//		if (!c2.adj.contains(c1))
//			c2.adj.add(c1);
//	}
//
//	void dfs(int start_num) {
//		Stack<com> stack = new Stack<com>();
//		stack.push(coms[start_num]);
//		coms[start_num].cntmark = true;
//		while (!stack.isEmpty()) {
//			com c = stack.pop();
//			for (com i : c.adj) {
//				if (i.cntmark == false) {
//					i.cntmark = true;
//					cnt++;
//					stack.push(i);
//				}
//			}
//		}
//
//	}
//
//}