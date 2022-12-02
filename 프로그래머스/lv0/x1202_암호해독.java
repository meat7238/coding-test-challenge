package 프로그래머스.lv0;

public class x1202_암호해독 {
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4; int cnt = 1;
        String answer = "";
        for(String s : cipher.split("")){
            if(cnt%code==0) answer+=s;
            cnt++;
        }
        System.out.println(answer);


    }
}
