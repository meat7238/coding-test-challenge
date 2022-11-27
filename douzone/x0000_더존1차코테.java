package douzone;


import java.util.Scanner;
import java.io.FileInputStream;
class x0000_더존1차코테 {
	static int AnswerN;
	static int N = 10;

	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream("C:\sample_input.txt"));
		Scanner sc = new Scanner(System.in);


		int T = sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			String[][] fo = new String[N][N];
			int x=0,y=0,cnt=0;
			AnswerN=0;
			
			//input
			for (int i = 0; i < fo.length; i++) {
				for (int j = 0; j < fo.length; j++) {
					fo[i][j] = sc.next();
					if('X' == fo[i][j].charAt(0)) { 
						x=i;y=j;
					}
				}
			}//end input
			
			//down
				for(int i=x+1;i<N;i++) {
					if(fo[i][y].charAt(0)=='Y') {
						break; 
					}else if(fo[i][y].charAt(0)=='H') {
						if(i+1<N) {
						if(fo[i+1][y].charAt(0)=='H') 
						AnswerN++;
						System.out.println(AnswerN);
						cnt++;
						break;
						}
					}
				}
			//end down
				
			//up
				for(int i=x-1;i>=0;i--) {
					if(fo[i][y].charAt(0)=='Y') {
						break;
					}else if(fo[i][y].charAt(0)=='H') {
						if(i-1>=0) {
						if(fo[i-1][y].charAt(0)=='H'&&i-1>0)
						AnswerN++;
						System.out.println(AnswerN);
						cnt++;
						break;
						}
					}
				}
			//up end
				
			//left
				for(int i=y-1;i>=0;i--) {
					if(fo[x][i].charAt(0)=='Y') {
						break;
					}else if(fo[x][i].charAt(0)=='H') {
						if(i-1>=0) {
						if(fo[x][i-1].charAt(0)=='H')
						AnswerN++;
						System.out.println(AnswerN);
						cnt++;
						break;
						}
					}
				}
			//left end
				
			//right
				for(int i=y+1;i<N;i++) {
					if(fo[x][i].charAt(0)=='Y') {
						break;
					}else if(fo[x][i].charAt(0)=='H') {
						if(i+1<N) {
						if(fo[x][i+1].charAt(0)=='H')
						AnswerN++;
						System.out.println(AnswerN);
						cnt++;
						break;
						}
					}
				}
			//
			System.out.println("#"+test_case+" "+cnt+" "+AnswerN);
			AnswerN=0;
		}
	}
}

//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		
//		int[][] a = new int[n][n]; 
//		
//		for (int i = 0; i < a.length; i++) {
//				String S= in.next();
//			for (int j = 0; j < a.length; j++) {
//				a[i][j] = S.charAt(j)-'0';
//				System.out.print(a[i][j]);
//			}			
//			System.out.println("");
//		}
//
//	}
//}

//Random rand = new Random();
//for (int i = 0; i < 1000; i++) {
//	int a = rand.nextInt(10); //0~9 랜덤
//	System.out.println(a);