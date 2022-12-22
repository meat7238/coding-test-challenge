package 프로그래머스.lv1;

public class x1222_핸드폰번호가리기 {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        String pre = phone_number.substring(0,phone_number.length()-4);
        String sub = phone_number.substring(phone_number.length()-4);
        System.out.println(pre.replaceAll("[0-9]","*") + sub);
    }
}

//
//class Solution {
//  public String solution(String phone_number) {
//    return phone_number.replaceAll(".(?=.{4})", "*");
//  }
//}
//
//class Solution {
//  public String solution(String phone_number) {
//     char[] ch = phone_number.toCharArray();
//     for(int i = 0; i < ch.length - 4; i ++){
//         ch[i] = '*';
//     }
//     return String.valueOf(ch);
//  }
//}