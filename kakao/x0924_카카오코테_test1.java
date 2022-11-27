package kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author meat 개인정보 수집된 개인정보는 유효기간 전까지만 보관가능, 유효기간 지나면 폐기
 * 예를들어 는 약관의 유효기간이 12달이고 21년 1우러 5일에 수집된 개인정보가 A약관으로 수집되었다면 해당 개인정보는 22년 1월 4일까지 보관가능이며 1월 5일부터 폐기할 ㄱ인정보.
 * 오늘날짜로 파기할 개인정보 번호목록을 int형 배열로반환하라
 */
public class x0924_카카오코테_test1 {
	public static void main(String[] args) {
		String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		String[] terms = {"A 6","B 12","C 3"};
		String today = "2022.05.19";
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution(today, terms, privacies)));

	}
}

class Solution {
	public int[] solution(String today, String[] terms, String[] privacies) {
		StringTokenizer s;
		List<Integer> answerlist = new ArrayList();
		s= new StringTokenizer(today,".");
		int tY=  Integer.parseInt(s.nextToken());
		int tM=  Integer.parseInt(s.nextToken());
		int tD=  Integer.parseInt(s.nextToken());

		
		for(int i = 0; i<privacies.length; i++) {
			s= new StringTokenizer(privacies[i],".");
			int Y= Integer.parseInt(s.nextToken());
			int M= Integer.parseInt(s.nextToken());
			s = new StringTokenizer(s.nextToken());
			int D = Integer.parseInt(s.nextToken());
			String T = s.nextToken();
			for(int j = 0; j< terms.length;j++) {
				if(T.charAt(0)==terms[j].charAt(0)){
				M+=(Integer.parseInt( terms[j].substring(2) ));
				if(M>12) {
					Y+=M/12;
					M-=12*(M/12);
				}
				if(336*tY+28*tM+tD >= 336*Y+28*M+D)
					answerlist.add(i+1);
				break;
				}
			}
		}
			
			int[] answer =new int[answerlist.size()];
			for(int i1=0; i1<answer.length;i1++) {
				answer[i1]=answerlist.get(i1);
			}
		return answer;
	}
}