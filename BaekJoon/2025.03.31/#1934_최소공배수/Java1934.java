import java.util.*;
import java.io.*;

public class Java1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
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
        br.close();

        StringBuilder sb = new StringBuilder();
        for(int n : list) sb.append(n).append("\n");
        System.out.println(sb.toString());
    }
}
