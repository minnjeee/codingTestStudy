import java.util.*;
import java.io.*;

public class Java1934 {
    // 최대공약수(gcd) 구하는 메서드
    public static long gcd(long x, long y) {
        while(y != 0) {
            long temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    // 최소공배수(lcd) 구하는 메서드
    public static long lcd(long x, long y) {
        return (x / gcd(x, y)) * y;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Long> list = new ArrayList<>();
        for(int i=0; i<N; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            list.add(lcd(input[0], input[1]));
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        for(long n : list) sb.append(n).append("\n");
        System.out.println(sb.toString());
    }
}


/*
 * List<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int result = 1;
            for(int j=2; ; j++) {
                int num = 0;
                while(input[0] > 0 && input[0] % j == 0) {
                    num++;
                    input[0] = input[0] / j;
                }
                int num2 = 0;
                while(input[1] > 0 && input[1] % j == 0) {
                    num2++;
                    input[1] = input[1] / j;
                }
                if (num > 0 || num2 > 0) {
                    result *= (j * Math.max(num, num2));
                }
                if (input[0] == 0 && input[1] == 0) {
                    break;
                }
            }
            list.add(result);
        }
 */