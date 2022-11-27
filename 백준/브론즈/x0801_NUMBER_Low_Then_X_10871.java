package 백준.브론즈;

import java.util.Scanner;

//public class Main {
//	public static void main(String[] args) {
//		
//		
//		Scanner in = new Scanner(System.in);
//				int N =1,X=0,min=0;
//				
//				System.out.print("input N & X : ");
//				N = in.nextInt();
//				X = in.nextInt();
//				int[] arr = new int[N];
//				
//				System.out.println("수열을 입력하세요.(ex.1 10 4 9 2 3 8 5 7 6");
//				for(int i=0; i<arr.length;i++) {
//					
//					arr[i] = in.nextInt();
//							
//				}
//				
//				for(int j=0; j<N; j++) {
//					if(arr[j]<X) System.out.print(arr[j]+" ");
//				}
//						
//						
//	}
//}

public class x0801_NUMBER_Low_Then_X_10871 {
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
				int N =1,X=0,temp=0;
				
				System.out.print("input N & X : ");
				N = in.nextInt();
				X = in.nextInt();
				
				System.out.println("수열을 입력하세요.(ex.1 10 4 9 2 3 8 5 7 6");
				for(int i=0; i<N;i++) {
					
					temp = in.nextInt();
					if(temp<X) System.out.print(temp+" ");
							
				}
				
						
						
	}
}