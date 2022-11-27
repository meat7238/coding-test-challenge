package douzone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class x1124_더존2차코테Re {

	static int AnswerN;
	static int N = 10;
	static int sum;
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			sum = 0;
			int maxPlusNum = 0;
			int plusOverlap = 0; 
			int negativeMaxNum = 0;
			int negativeOverlap = 0; 
			int maxNum = 0;
			int AnswerN = 0;
			List<Integer> player = new ArrayList<>();
			
			//입력
			for(int i=0; i<N;i++) {
				player.add(sc.nextInt());
				sum += player.get(i);
				if(player.get(i)>0) {
					maxPlusNum = Math.max(maxPlusNum, player.get(i));
				}else if(player.get(i)<0){
					negativeMaxNum = Math.min(negativeMaxNum, player.get(i));
				}
				maxNum = Math.max(maxNum, Math.abs(player.get(i)));
			}
			
			//중복검사
			for(int num : player) {
				if(num == maxPlusNum) plusOverlap++;
				if(num == negativeMaxNum) negativeOverlap++;
			}
			
//			System.out.println("sum : " + sum +" / "+ "maxPlusNum:"+maxPlusNum + " / " + "negativeMaxNum:"+negativeMaxNum + " / "+"plusOverlap:"+plusOverlap+" / "+"negativeOverlap:" + negativeOverlap);
			//판별,합산
			for(int num : player) {
				if(sum >0) {
					if(negativeOverlap==1 && num ==negativeMaxNum)
						AnswerN += sum;
					else
						AnswerN += sum-negativeMaxNum;
					continue;
				}else if(sum <0) {
					if(plusOverlap==1 && num==maxPlusNum)
						AnswerN += Math.abs(sum);
					else
						AnswerN += Math.abs(sum-maxPlusNum) ;
					continue;
				}else
				AnswerN += sum+maxNum;
			}
			
			//연속된 선수 각각을 모두 고려하기
			//합이 음수? 양수?
			//음수라면 양수 중 큰값 제외
			//양수라면 음수중 큰값제외
			//자신이 아닌 한명을 제외할 수 있음
			//이후 abs로 절대값을 구하고 결과값에 합산
			
			
			System.out.println("#" + test_case + " " + AnswerN);
		}
	}
}
