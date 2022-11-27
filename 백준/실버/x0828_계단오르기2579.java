package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class x0828_계단오르기2579 {
	/** 백준 2579
	 *	계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다. 즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
	 *	연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다.
	 *	마지막 도착 계단은 반드시 밟아야 한다.
	 *	각 계단에 쓰여 있는 점수가 주어질 때 이 게임에서 얻을 수 있는 총 점수의 최댓값을 구하는 프로그램을 작성하시오.
	 *	계단의 개수 N < 300이하 자연수
	 *	점수는 10000이하 자연수 
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	//필요한 변수 선언
	static int[] Stair ;
	static int[] sum ; //메모라이즈 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	//초기화 및 입력
	int N;
	N=Integer.parseInt(br.readLine());	
	sum = new int[N+1]; 	//메모라이즈
	Stair = new int[N+1];
	Stair[0] = 0;
	for(int i=1;i<N+1;i++) Stair[i]=Integer.parseInt(br.readLine());
	System.out.println(MaxStair(N));
	}
	
	//	N에 점프해서 도착했을경우, 최대값은 Stair[N] + Stair[N-2]까지의 최대값
	//	N 이전에 점프해서 도착했을경우, 3번이상 연이어 오를 수 없으므로 최대값은 Stair[N] + Stair[N-1] + Stair[n-3]까지의 최대
	static int MaxStair(int num){
		if(num==0) return 0;
		if(num==1) return Stair[1];
		if(num==2) return Stair[1]+Stair[2];
		if(sum[num] != 0) return sum[num];		//메모라이즈 
		sum[num]= Math.max(Stair[num]+MaxStair(num-2), Stair[num]+Stair[num-1]+MaxStair(num-3));
		return sum[num];
	}
}


//재귀함수 사용시 메모리 초과 오류 ->for로 풀거나 들어가는 값들의 범위를 지정해야한다.	
//sum[num]= Math.max(Stair[num]+MaxStair(num-2), Stair[num]+Stair[num-1]+MaxStair(num-3));

	