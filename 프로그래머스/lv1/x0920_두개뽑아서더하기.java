package 프로그래머스.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author meat 정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들
 *         수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 */
//public class x0920_두개뽑아서더하기 {
//	public static void main(String[] args) {
//		int[] number = { 2, 1, 3, 4, 1 };
//		Solution s = new Solution();
//		System.out.println(Arrays.toString(s.solution(number)));
//
//	}
//}

//class Solution {
//	public int[] solution(int[] numbers) {
//		ArrayList<Integer> list = new ArrayList();
//		for (int j = 0; j < numbers.length - 1; j++) {
//			for (int i = j + 1; i < numbers.length; i++) {
//				if (!list.contains(numbers[i] + numbers[j])) {
//					list.add(numbers[i] + numbers[j]);
//				}
//			}
//		}
//		Collections.sort(list);
//
//		int[] answer = new int[list.size()];
//		for(int i=0; i<list.size();i++) {
//			answer[i] = list.get(i);
//		}
//		return answer;
//	}
//}

//Arrays.sort(arr);
//int t=0;
//for(int i=0; i<arr.length; i++) {
//	if(i==0||arr[i]!=arr[i-1]) {
//		arr[t++]=arr[i];
//	}
//}
//int[] arr3 = Arrays.copyOf(arr, t);
//System.out.println(Arrays.toString(arr3));
//
//}