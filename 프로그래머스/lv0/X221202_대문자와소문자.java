package 프로그래머스.lv0;

public class x1202_대문자와소문자 {
    public static void main(String[] args) {
        String my_string = "cccCCC";
        System.out.println((int)('a'));
        String answer = "";
        for( char a : my_string.toCharArray()){
            if(a<97) {
                answer+=(char)(a+32);
                continue;
            }
            answer+=(char)(a-32);
        }
        System.out.println(answer);


    }
}


//class Solution {
//    public String solution(String myString) {
//        return myString.chars().mapToObj(operand -> String.valueOf((char) (Character.isLowerCase(operand) ? Character.toUpperCase(operand) : Character.toLowerCase(operand)))).collect(Collectors.joining());
//    }
//}