import java.util.*;

public class Java1735 {
    public static long gcd(long a, long b) {
        while(b != 0) {
            long temp = b;
            b =  a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] m = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        sc.close();

        int a = n[0] * m[1] + n[1] * m[0];
        int b = n[1] * m[1];

        StringBuilder sb = new StringBuilder();
        sb.append((int) (a / gcd(a,b))).append(" ");
        sb.append((int) (b / gcd(a,b)));
        System.out.println(sb.toString());
    }
}