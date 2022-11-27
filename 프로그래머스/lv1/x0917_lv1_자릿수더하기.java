package 프로그래머스.lv1;
import java.util.*;

public class x0917_lv1_자릿수더하기 {
	public static void main(String[] args) {
		
	}

}

class Solution {
	public int solution(int n) {
		int answer = 0;
		while(n>0){
		answer += n%10;
		n=n/10;
	}
	return answer;
}
}