package 프로그래머스.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 행렬의덧셈 {
	public static void main(String[] args) {
		
	int[][] arr1 = {{5,6},{7,8}};
	int[][] arr2 = {{1,2},{3,4}};
	int[][] answer = new int[arr1.length][arr1[0].length];
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr1[0].length;j++) {
			answer[i][j] = arr1[i][j]+arr2[i][j];
		}
	}
	
	}
}
