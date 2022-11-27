package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
//class People {
//	private int x=0, y=0, rank=0;
//	
//	People(){
//	}
//	
//	People(int x, int y){
//		setX(x);
//		setY(y);
//		
//	}
//	public int getX() {
//		return x;
//	}
//
//	public void setX(int x) {
//		this.x = x;
//	}
//
//	public int getY() {
//		return y;
//	}
//
//	public void setY(int y) {
//		this.y = y;
//	}
//
//	public int getRank() {
//		return rank;
//	}
//
//	public void setRank(int rank) {
//		this.rank = rank;
//	}
//
//}
//public class x0817_덩치_7568 {
//	
//
//	public static void main(String[] args)throws IOException {
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		
//		int N = Integer.parseInt(bf.readLine());
//		Scanner in = new Scanner(System.in);
//		People[] pp = new People[N];
////		for(int i =0; i<N ; i++) {
////			pp[i] = new People(in.nextInt(),in.nextInt());
//
//		
//		/* people 클래스에 값 입력하기 */
//		String s;
//		for(int i =0; i<N ; i++) {
//			pp[i] = new People();
//			s = bf.readLine();
//			StringTokenizer ss = new StringTokenizer(s);
//			pp[i].setX(Integer.parseInt(ss.nextToken()));
//			pp[i].setY(Integer.parseInt(ss.nextToken()));
//		}
//		
//		/* 등수찾기 */		
//		for(int i=0; i<N; i++) {
//			int cnt=0;
//			
//			for(int j=0; j<N; j++) {
//				if(pp[j].getX()>pp[i].getX() && pp[j].getY()>pp[i].getY()) {
//				cnt++;
//				}	
//			}
//			pp[i].setRank(cnt+1);
//		}
//		
//		/* 출력하기 */
//		String sb = "";
//		
//		for(int i=0; i<N; i++) {
//			sb += pp[i].getRank()+" ";
//		}
//		sb=sb.substring(0,sb.length()-1);
//		System.out.println(sb);
//
//
//	}
//
//
//}

public class x0817_덩치_7568_v {
	static class person {
		int weigh;
		int heigh;
		int rank;

		person(int w, int h) {
			this.weigh = w;
			this.heigh = h;
			rank = 0;
		}
	}

	static person[] persons;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		persons = new person[N];
		String sb = "";
		for (int i = 0; i < N; i++) {
			persons[i] = new person(sc.nextInt(), sc.nextInt());
			System.out.println(persons[i].weigh + " "+ persons[i].heigh);
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (persons[i].weigh < persons[j].weigh & persons[i].heigh < persons[j].heigh)
					persons[i].rank++;
			}
			sb += (persons[i].rank+1) + " ";
		}
		sb.substring(0, sb.length()-1);
		System.out.print(sb);
	}

}
