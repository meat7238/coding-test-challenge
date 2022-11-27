package 프로그래머스.lv1;

public class 하샤드수 {
	static int x=11;
		
	public static void main(String[] args) {
        int sum=0;
        int num = x;
		while(num>0) {
			sum += num%10;
			num = num/10;
		}
		
		boolean answer = (x%sum==0)?true:false;
		System.out.println(answer);
		
	}
}