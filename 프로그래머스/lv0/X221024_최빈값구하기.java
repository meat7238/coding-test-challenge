package 프로그래머스.lv0;

public class x1024_최빈값구하기 {
	public static void main(String[] args) {
		int[] array = {999,999,998};
        int max= 0,ct=0;
        int answer=0;
        int[] count = new int[1000];
        for(int i=0; i<array.length;i++){
            count[array[i]]++;
            max = Math.max(max, count[array[i]]);
        }
        for(int i=0; i<1000;i++){
        	if(max == count[i]) {
        		answer = i;
        		ct++;
        	}
        	
        }
         if(ct>1)
            answer = -1;
         
        System.out.println(answer);
        
        
        int n = 5;

	}

}
