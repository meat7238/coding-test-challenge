package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

class G {
	class Node {
		int data;
		LinkedList<Integer> adjacent_id;
		int visited;
		Node(int data){
			this.data = data;
			this.visited = 0;
			adjacent_id = new LinkedList<Integer>();
		}
	}
	
	Node[] V; //노드 집합
	int cnt=0;
	
	G(int N){
		V = new Node[N+1];
		for(int i=1; i<=N;i++) {
			V[i] = new Node(i);
		}
	}
	
	void orderin(int i1, int i2) {
		
		Node n1 = V[i1];
		Node n2 = V[i2];
		if(!n1.adjacent_id.contains(i2)) {
			n1.adjacent_id.push(i2);
		}
		if(!n2.adjacent_id.contains(i1)) {
			n2.adjacent_id.push(i1);
		}
	}
	
	
	void dfsR(Node r) {
		if(r==null) return;
		r.visited = ++cnt;
		for(int n : r.adjacent_id) {
			if(V[n].visited == 0) {
				dfsR(V[n]);
			}
		}
	}
	
	void dfsR(int R) {
		Node r = V[R];
		dfsR(r);
	}
}
public class x0923_알고리즘수업_깊이우선탐색2_24480 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer ss = new StringTokenizer(s);
		int N = Integer.parseInt(ss.nextToken()), M=Integer.parseInt(ss.nextToken()), R=Integer.parseInt(ss.nextToken());
		G g = new G(N);
		
		for(int i=0; i<M; i++) {
			s=br.readLine();
			ss= new StringTokenizer(s);
		g.orderin(Integer.parseInt(ss.nextToken()), Integer.parseInt(ss.nextToken()));
		}
		
		for(int i=1; i<N+1; i++) {
			if(g.V[i].adjacent_id.isEmpty()) continue;
			g.V[i].adjacent_id.sort(Collections.reverseOrder());
		}
		g.dfsR(R);
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<N+1;i++) {
			sb.append(g.V[i].visited).append("\n");
		}
		System.out.println(sb); 
	}
}
