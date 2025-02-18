import java.util.*;

public class Java24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();
        sc.close();

        /*
         * 첫번째 풀이
        // f(n) = a1 n + a0
        // g(n) = n
        // a1 * n0 + a0 <= c * n0
        if (a1 * n0 + a0 <= c * n0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        */

        // 두번째 풀이 - 그래프로 생각해보기!!!!
        if (a1 < c) { 
            // n=n0일 때 성립하면 무조건 성립
            if (n0 * (c - a1) >= a0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else if (a1 == c) {
            // 절편 a0 <= 0 이면 무조건 성립
            if (a0 <= 0) System.out.println(1);
            else System.out.println(0);
        } else System.out.println(0); // 나중에 반드시 f(n)이 더 커지게 되어, 무조건 성립 안 함
    }
}