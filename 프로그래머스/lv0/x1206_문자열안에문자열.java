package 프로그래머스.lv0;

public class x1206_문자열안에문자열 {
    public static void main(String[] args) {
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        System.out.println(Integer.parseInt(str1.contains(str2)?"1":"2"));
    }
}
