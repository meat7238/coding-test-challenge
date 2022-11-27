package kakao;

/**
 * @author meat
 * n*m 격자 미로가 주어집니다. 당신은 미로의 (x,y)에서 출발해 (r,c)로 이동해서 탈출해야 합니다.
 * 단, 미로를 탈출하는 조건이 세가지 있습니다.
 * 격자의 바까으로는 나갈 수 없습니다.
 * (x,y)에서 (r,c)까지 이동하는 거리가 총 k여야 합니다. 이때 (x,y)와 (r,c)격자를 포함해, 같은 격자를 두번 이상 방문해도 됩니다.
 * 미로에서 탈출한 경로를 문자열로 나타냈을 떄, 문자열이 사전순으로 가장 빠른 경로로 탈출해야합니다.
 * 이동 경로는 다음과 같이 문자열로 바꿀 수 있습니다.
 * l : 왼쪽으로 한칸이동
 * r : 오른쪽으로 한칸이동
 * u : 위쪽으로 한칸이동
 * d : 아래쪽으로 한칸이동
 *격자의 크기를 정하는 정수 n,m / 출발위치를 뜻하는 x,y / 탈출지점을 뜻하는 r, c/ 탈출까지 이동해야하는 거리 정수 k
 *탈출할 수 없는경우 impossible 리턴.
 * n=3 m=4 x=2 y=3 r=3 c=1 k=5 
 * return "dllrl"
 * 
 * n=3 m=3 x=1 y=2 r=3 c=3 k=4
 * return "impossible"
 * abs(x-r)+abs(y-c)값보다 2n-1차이나는 k는 impossible 
 */
public class x0924_카카오코테_test6 {
	public static void main(String[] args) {
		Solution6 s = new Solution6();
		System.out.println(s.solution(3, 4, 2, 3, 3, 1, 5));
		System.out.println(s.solution(3, 3, 1, 2, 3, 3, 4));
	}

}
class Solution6 {
    public String solution(int n, int m, int x, int y, int r, int c, int k) {
    	if((Math.abs(x-r)+Math.abs(y-c))%2==0) {
    		if(k%2==1) return "impossible";
    	}else if(k%2==0) return "impossible";
    	
    	
        String answer = "음";
        return answer;
    }
}