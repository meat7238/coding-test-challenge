package 백준.브론즈;

import java.util.Scanner;

public class x0731_ArrMaxMin_10818 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

//		int[] arr = new int[n];
		int[] arr = {in.nextInt(),in.nextInt()}; //이런 방법은 없는지, 왜 안되는지 질문해보기 

		for (int j = 0; j < n; j++) // n대신 arr.length 써도 된
			arr[j] = in.nextInt();

		int max=arr[0], min = arr[0];

		for (int i = 1; i < n; i++) {
			if (max < arr[i])
				max = arr[i];
			else if (min > arr[i])
				min = arr[i];
		}
		System.out.println(min+" "+max);
		
		
		 

	}
}
