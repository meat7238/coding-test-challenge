package 백준.실버;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class point {
	int x;
	int y;
	public point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}

public class x1028_좌표정렬하기_11650 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		point[] points = new point[N];
		for(int i=0;i<N;i++) {
			points[i] = new point(sc.nextInt(),sc.nextInt());
		}
		Arrays.sort(points,new Comparator<point>() {
			public int compare(point o1, point o2) {
				if(o1.x==o2.x) return o1.y-o2.y;
				return o1.x-o2.x;
			}
		});
		
		for(int i=0; i<N;i++) {
			System.out.println(points[i].x+ " " + points[i].y);
		}
	}
}
