import java.util.*;

public class Java24267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        /*
         * 첫번째 생각
         7 => 1*5 + 2*4 + 3*3 + 4*2 + 5*1 => (n-6)*(n-2) + (n-5)*(n-3) + (n-4)*(n-4) + (n-3)*(n-5) + (n-2)*(n-6)
         1 2 3 4 5
         1 -> 2 3 4 5 6
             2 -> 3 4 5 6 7
             3 -> 4 5 6 7
             4 -> 5 6 7
             5 -> 6 7
             6 -> 7
         2 -> 3 4 5 6
             3 -> 4 5 6 7
             4 -> 5 6 7
             5 -> 6 7
             6 -> 7
         3 -> 4 5 6
         4 -> 5 6
         5 -> 6
         
        long result = 0;
        for(int i=1; i<n-1; i++) {
            result += i * (n-i-1);
        }
        */

        long result = n*(n-1)*(n-2)/6;
        System.out.println(result);
        System.out.println(3);

    }
}
