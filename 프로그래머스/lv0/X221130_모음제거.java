package 프로그래머스.lv0;

public class x1130_모음제거 {
    public static void main(String[] args) {
        String my_string = "nice to meet you";

        String answer = "";
        for(char a : my_string.toCharArray()){
            if(a == 'a' | a == 'e' | a == 'i' | a == 'o' | a== 'u'){
                continue;
            }
            answer += a;
        }
        System.out.println(answer);
    }
}

//다른풀이 : 람다식
class Solution {
    public String solution(String my_string) {
        String answer = "";

        answer = my_string.replaceAll("[aeiou]", "");

        return answer;
    }
}