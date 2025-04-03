import java.util.*;

public class Java13241 {

    public static long gcd(long a, long b) {
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] n = Arrays.stream(sc.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long a = n[0];
        long b = n[1];
        sc.close();

        long result = (a / gcd(a,b)) * b;
        System.out.println(result);

    }
}
