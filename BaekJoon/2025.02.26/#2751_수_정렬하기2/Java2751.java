import java.util.*;
import java.io.*;

class Java2571 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        for (int i=0; i<N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        Arrays.sort(numbers);

        for (int n : numbers) {
            System.out.println(n);
        }
    }
}

// 수 정렬하기1과 같이 버블 정렬로 코드를 짜면 시간 초과 발생
// => Arrays.sort() 메소드를 이용하였음!