package kakao;

/**
 * @author meat 일렬로 나열된 n개의 집에 택배를 배달하려고 한다. 물건은 모두 크기가 같으 ㄴ재활용 택배 상자에 담아 배달하며
 *         배달을 다니면서 빈 재활용 택배상자들을 수거하려고한다 배달할 택배들은 모두 재활용 택배 상자에 담겨서 물류창고에 보관되어
 *         있고, i번째 집은 물류 창고에서 i거리만큼 떨어져 있고, i번째 집은 j번째집과 j-i만큼 떨어져 있다.
 *         1<=i<=j<=n 트럭에는 최대 cap개 실을 수 있다. 트럭은 배달할 재활용 택배상자들을 실어 물류창고에서 출발해 각
 *         집에배달하면서 빈 상자를 수거해 물류창고에 내린다. 각 집마다 배달할 상자갯수와 수거할 빈상자 갯수를 알고 있을때 트럭
 *         하나로 모든 배달과 수거를 마치고 물류창고까지 돌아올 수 있는 최소 이동 거리?? cap : 4 n : 5
 *         deliveries : 1,0,3,1,2 pickups : 0,3,0,4,0
 * 
 *         return : 16
 *         
 *         cap:2 n:7 deliveries : 1,0,2,0,1,0,2 pickups : 0,2,0,1,0,2,0
 *         
 *         return : 30
 */
public class x0924_카카오코테_test2 {
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int[] deliveries = { 1, 0, 2, 0, 1,0,2 };
		int[] pickups = { 0, 2, 0, 1, 0,2,0 };
		System.out.println(s.solution(2, 7, deliveries, pickups));
	}
}

class Solution2 {
	public long solution(int cap, int n, int[] deliveries, int[] pickups) {
		long answer = 0;
		int capd = cap;
		int capp = cap;
		int temp, chk=0;
		boolean[] mark = new boolean[n];

		while (true) {
			for (int i = n - 1; i >= 0; i--) {
				if (deliveries[i] > 0 | pickups[i] > 0) {
					answer += i;
					
					System.out.println("첫번째반복문 언제 탈출 ? :"+ i + " / d:"+ deliveries[i] + "/ p:"+ pickups[i]);
					break;
				}
				chk++;
				if(chk==n) return answer;;
			}
			for (int i = n - 1; i >= 0; i--) {
				
				System.out.println(i+ " 배달 "+ " / d:"+ deliveries[i] + "/ p:"+ pickups[i]);
				temp = 0; //수용공간 = -배달 + 픽업 < cap
				//capd : 현재 배달량
				if (capd > deliveries[i]) {
					capd -= deliveries[i];
					temp += deliveries[i];
					deliveries[i] = 0;
				} else if (capd <= deliveries[i]) {
					deliveries[i] -= capd;
					temp +=capd;
					capd = 0;
				}
				System.out.println(i + " 수거전 "+ " / d:"+ deliveries[i] + "/ p:"+ pickups[i]);

				System.out.println("1capp:"+capp);
				System.out.println("2capp:"+capp);
				
				if (capp > pickups[i]) {
					capp -= pickups[i];
					pickups[i] = 0;
				} else if (capp <= pickups[i]) {
					pickups[i] -= capp;
					capp = 0;
				}
				System.out.println(i + " 수거후"
						+ " "+ " / d:"+ deliveries[i] + "/ p:"+ pickups[i]);
				System.out.println("capp후:"+capp);

				if (capd == 0 & capp == 0)
					break;

			}
		}
		
	}
}