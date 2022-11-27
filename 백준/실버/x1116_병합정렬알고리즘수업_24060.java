package 백준.실버;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class x1116_병합정렬알고리즘수업_24060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        while (N-->0){
            A.add(sc.nextInt());
        }
    }
    private List merge_sort(List<Integer> A, int p, int r) {
        if (p < r){
            int q = (p + r) / 2;
            merge_sort(A, p, q);
            merge_sort(A, q + 1, r);
            merge(A, p, q, r);
        }
        return A;
    }

    private List merge(List<Integer> A, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 1;
        List<Integer> tmp = new ArrayList<>();
        while (i<=q && j<=r) {//(i ≤ q) && (j ≤ r)
            if (A.get(i) <= A.get(j)) {
                tmp.set(t++, A.get(i++));
            }else {
                tmp.set(t++, A.get(j++));
            }
        }
        while (i <= q)
        tmp.set(t++, A.get(i++));
        while (j <= r)
        tmp.set(t++, A.get(j++));
        i = p; t = 1;
        while (i <= r)
        A.set(i++, tmp.get(t++));

        return null;
    }
}
