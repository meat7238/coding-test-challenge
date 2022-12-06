package 프로그래머스.lv0;

import java.util.Arrays;

public class x1205_ox퀴즈 {
    public static void main(String[] args) {
        String[] quiz = {"-3 - -3 = 0", "5 + 6 = 11"};
        String[] answer = new String[quiz.length];
        for(int i = 0; i<quiz.length;i++){
            String result = quiz[i].split("= ")[1];
            int sum = Arrays.stream(quiz[i].split("=")[0]
                    .replaceAll("- -","+")
                    .replaceAll("- ","-")
                    .replaceAll("[+] ","")
                    .split(" "))
                    .mapToInt(Integer::parseInt).sum();
            answer[i] = (Integer.parseInt(result) == sum)? "O":"X";
        }
            System.out.println(Arrays.toString(answer));
    }
}

//class Solution {
//    public String[] solution(String[] quiz) {
//        return Arrays.stream(quiz).map(s -> {
//            String[] arr = s.trim().split(" ");
//            return arr[1].equals("+") && Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) || Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) ? "O" : "X";
//        }).toArray(String[]::new);
//    }
//}