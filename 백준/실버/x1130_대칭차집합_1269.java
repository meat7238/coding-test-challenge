package 백준.실버;

import java.util.*;

public class x1130_대칭차집합_1269 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        int aCount = sc.nextInt();
        int bCount = sc.nextInt();
        for(int i=0; i<aCount;i++) {
            a.add(sc.nextInt());
        }
        for(int i=0; i<bCount;i++){
            b.add(sc.nextInt());
        }
        //aXb
        a.retainAll(b);
        System.out.println(aCount + bCount - 2*(a.size()));
    }
}
