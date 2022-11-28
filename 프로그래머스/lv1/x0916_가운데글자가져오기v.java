//package 프로그래머스.lv1;
//
//import java.util.Scanner;
///* 내 풀이법
//class Solution {
//    public String solution(String s) {
//    	String answer;
//    	if(s.length()%2==1)
//    		answer = Character.toString(s.charAt(s.length()/2));
//    	else {
//    		answer = Character.toString(s.charAt(s.length()/2-1));
//    		answer += Character.toString(s.charAt(s.length()/2));
//    	}
//
//        return answer;
//    }
//}
//*/
//
//
//
///* substring */
////class Solution {
////    public String solution(String s) {
////    	String answer = s.substring((s.length()-1)/2, (s.length()/2)+1);
////        return answer;
////    }
////}
//
///**
// * @author meat
// *단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
// *단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
// *재한사항
// *s는 길이가 1 이상, 100이하인 스트링입니다.
//
// */
//public class x0916_가운데글자가져오기v {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Solution s = new Solution();
//		System.out.println(s.solution(sc.next()));
//	}
//
//}
////public class 가운데글자가져오기복습 {
////	public static void main(String[] args) {
////		String s = "abcd";
////		s=s.substring((s.length()-1)/2, s.length()/2+1);
////		System.out.println(s);
////	}
////
////}
