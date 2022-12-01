package 프로그래머스.lv0;

public class x1201_컨트롤제트 {
    public static void main(String[] args) {
        String s = "1 2 Z 3";
        String[] result = s.split(" ");
        int answer = 0;
        for(int i = 0; i<result.length;i++){
            if(result[i].equals("Z")) {
                answer -= Integer.parseInt(result[i-1]);
                continue;
            }
            answer += Integer.parseInt(result[i]);
        }
        System.out.println(answer);
    }
}

//다른 풀이
//        import java.util.*;
//
//class Solution {
//    public int solution(String s) {
//        int answer = 0;
//        Stack<Integer> stack = new Stack<>();
//
//        for (String w : s.split(" ")) {
//            if (w.equals("Z")) {
//                stack.pop();
//            } else {
//                stack.push(Integer.parseInt(w));
//            }
//        }
//        for (int i : stack) {
//            answer += i;
//        }
//        return answer;
//    }
//}