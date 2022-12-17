package 프로그래머스.lv0;

public class x1217_7의갯수 {
    public static void main(String[] args) {
        int[] array = {7,77,17};
        int answer = 0;
        for(int a : array){
            String[] as = (a+"").split("");
            for(String str : as){
                if (str.contains("7")) answer++;
            }
        }

        System.out.println(answer);
    }
}

//class Solution {
//    public int solution(int[] array) {
//        return (int) Arrays.stream(
//                        Arrays.stream(array)
//                                .mapToObj(String::valueOf)
//                                .collect(Collectors.joining())
//                                .split("")
//                )
//                .filter(s -> s.equals("7"))
//                .count();
//    }
//}