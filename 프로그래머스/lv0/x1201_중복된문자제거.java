package 프로그래머스.lv0;

public class x1201_중복된문자제거 {
    public static void main(String[] args) {
        String my_string = "people";
        String answer = "";
        for(String a : my_string.split("")){
            if (!answer.contains(a)) {
                answer +=a;
            }
        }
        System.out.println(answer);

    }
}
//다른방식
//
//class Solution {
//    public String solution(String myString) {
//        return Arrays.stream(myString.split("")).distinct().collect(Collectors.joining());
//    }
//}
