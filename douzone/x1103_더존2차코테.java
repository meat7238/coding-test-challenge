//package douzone;
//
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.Stack;
//
//public class x1103_더존2차코테 {
//	static int AnswerN;
//	static int N = 10;
//	static int M;
//
//	class dice {
//		int data;
//		List<Integer> adjacent;
//		int marked;
//
//		dice(int data) {
//			this.data = data;
//			this.marked = 0;
//			adjacent = List.of(1, 2, 3, 4, 5, 6);
//		}
//
//	}
//
//	public static void main(String[] args) {
//		// System.setIn(new FileInputStream("C:\sample_input.txt"));
//		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
//		dice[] dices = new dice[7];
//		for (int test_case = 1; test_case <= T; test_case++) {
//			int position = 0;
//			int sum = 0;
//			N = sc.nextInt();
//			M = sc.nextInt();
//			LinkedList<Integer> list = new LinkedList<>();
//			for (int i = 0; i < 4 * (N - 1); i++) {
//				list.add(sc.nextInt());
//			}
//			for (int i = 1; i < 7; i++) {
//				dices[i] = new dice(i);
//				dices[i].marked = M;
//			}
//
//			for (int i = 1; i < 7; i++) {
//				Stack<dice> stack = new Stack<dice>();
//				stack.push(dices[i]);
//				dices[i].marked--;
//				while (!stack.isEmpty()) {
//					dice d = stack.pop();
//					for (int c : d.adjacent) {
//						if (dices[c].marked > 0) {
//							dices[c].marked--;
//							stack.push(dices[c]);
//							position+=c;
//							if(position > (N-1)*4) {
//								position = position-((N-1)*4)-1;
//							}
//							sum += list.get(position);
//
//						}
//					}
//
//				}
//
//				while (true) {
//
////				for (int i=1; i<=6;i++) {
////					if(dice.get(i)>0) {
////						sum += list.get(position+i);
////					}
//
//				}
//			}
//
//			// 0부터 4*(N-1)까지 반복순회,지출비용의 최소값 구하기
//			// 비교시 dice의 value값이 0보다 클때 사용, 사용 후 value --차감.
//			// position이 (n-1)*4를 넘으면 그 차이만큼을 다시 포지션에 대입. ex.43-40 = 3, position= 3-1(리스트성격)
//			// 6<=N<=21
//			// 1<=M<=4
//
//			System.out.println("#" + test_case + " " + AnswerN);
//		}
//
//	}
//
//}
////1
////6 1
////0 400 300 200 100 500 700 900 500 500 400 300 700 400 800 900 200 300 300 400
//
////3
////6 1
////0 400 300 200 100 500 700 900 500 500 400 300 700 400 800 900 200 300 300 400
////6 1
////0 500 400 500 600 700 800 900 1000 600 400 300 700 1500 400 100 0 700 200 500
////11 2
////0 500 100 200 300 500 700 500 600 300 400 500 100 200 800 100 500 600 400 300 200 0 400 100 300 800 700 200 300 400 700 600 0 300 200 500 400 300 1000 2000
//
//
////#1 1200
////#2 1300
////#3 1300
//
//
//
//
//
//
//
////------------//
///*
//#include <stdio.h>
//#include <memory.h>
//
//#define N 105
//#define M 5
//
//int n, m;
//int a[N];
//int dp[N][M][M][M][M][M][M];
//int cnt[7];
//
//int process(int x)
//{
//   if (x > n) {
//      return a[(x - 1) % n + 1];
//   }
//
//   int& ret = dp[x][cnt[1]][cnt[2]][cnt[3]][cnt[4]][cnt[5]][cnt[6]];
//
//   if (ret != -1) return ret;
//
//   for (int i = 1; i <= 6; i++) {
//      if (cnt[i] > 0) {
//         cnt[i]--;
//         int tmp = process(x + i);
//         cnt[i]++;
//
//         if (ret == -1 || ret > tmp) {
//            ret = tmp;
//         }
//      }
//   }
//
//   return ret += a[x];
//}
//
//int main()
//{
//   int t;
//   scanf("%d", &t);
//   for (int i = 1; i <= t; i++) {
//      scanf("%d %d", &n, &m);
//      n = (n - 1) * 4;
//      for (int j = 1; j <= n; j++) scanf("%d", &a[j]);
//
//      memset(dp, -1, sizeof(dp));
//      for (int j = 1; j <= 6; j++) cnt[j] = m;
//
//      printf("#%d %d\n",i, process(1));
//   }
//   return 0;
//}
//
//*/