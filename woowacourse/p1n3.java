package woowacourse;

public class p1n3 {
	public static void main(String[] args) {
		int number = 9999;
		
	//--------------------------------
        int answer = 0;
        
        int temp = 0;
        for(int i=1; i<=number;i++) {
        	temp = i;
        	while(temp>0) {
        		if((temp%10==3)||(temp%10==6)||(temp%10==9)) {
        			answer++;
        		}
        		temp/=10;
        	}
        }
        System.out.println(answer);
	}
}
