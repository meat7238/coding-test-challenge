package 프로그래머스.lv0;

import java.util.Arrays;

public class x1203_한번만등장한문자 {
    public static void main(String[] args) {
        String s = "abcabcadc";
        StringBuilder temp = new StringBuilder();
        String answer;
        for (String str : s.split("")) {
            int cnt = 0;
            for (String str2 : s.split("")) {
                if (str.equals(str2)) cnt++;
            }
            if (cnt < 2 & !temp.toString().contains(str)) temp.append(str);
        }
        String[] tmp = temp.toString().split("");
        Arrays.sort(tmp);
        answer = String.join("",tmp) ;
        System.out.println(answer);

    }
}

//괜찮아보이는코드
//class Solution {
//    public String solution(String s) {
//        int[] alpha = new int[26];
//        for(char c : s.toCharArray()){
//            alpha[c - 'a']++;
//        }
//
//        StringBuilder answer = new StringBuilder();
//        for(int i = 0; i < 26; i++){
//            if(alpha[i] == 1){
//                answer.append((char)(i + 'a'));
//            }
//        }
//        return answer.toString();
//    }
//}

//희표좌
//import java.util.Arrays;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//class Solution {
//    public String solution(String s) {
//        return Arrays.stream(s.split(""))
//                .collect(Collectors.groupingBy(s1 -> s1))
//                .entrySet()
//                .stream()
//                .filter(entry -> entry.getValue().size() <= 1)
//                .map(Map.Entry::getKey)
//                .sorted()
//                .collect(Collectors.joining());
//    }
//}
