package 백준.실버;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Stack;
//
//public class 스택수열 {
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Stack<Integer> stack = new Stack<Integer>();
//		StringBuilder sb = new StringBuilder();
//		
//		int n = Integer.parseInt(br.readLine());
//		int[] a = new int[n];
//		int cp = 0;
//		
//		
//		while(n-- > 0) {
//			int input = Integer.parseInt(br.readLine());
//			
//			if(input>=cp) {
//				for(int i = cp + 1; i <= input; i++) {
//					stack.push(i);
//					sb.append('+').append('\n');
//				}
//				cp = input;
//			} else if(stack.peek()!=input) {
//				System.out.println("NO");
//				System.exit(0);
//			}
//			
//			stack.pop();
//			sb.append('-').append('\n');
//		}
//		System.out.println(sb);
//		
//		
//	}
//}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class x0823_스택수열_1874 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		int ck = 0;
		int[] ck2 = new int[n+1];
		
		for(int i = 0; i<n;i++) {
			a[i] = Integer.parseInt(br.readLine());
			ck2[i]=i;
		}
		ck2[n]=n;
		try {
		stack.push(ck);
		for(int i=0; i<n; i++) {
			while(stack.peek() < a[i]){
				if(stack.peek()==0) stack.pop();
				stack.push(++ck);
				sb.append('+').append('\n');
			}
			if(stack.peek()==a[i]) {
			stack.pop();
			sb.append('-').append('\n');
			}else throw new Exception("NO");
			if(stack.empty()) stack.push(0);
		}
		System.out.println(sb);
		}catch(Exception e) {
			System.out.println("NO");
		}
	}
}
