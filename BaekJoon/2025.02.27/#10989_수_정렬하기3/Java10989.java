import java.util.*;
import java.io.*;

class Java10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        for (int i=0; i<N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        Arrays.sort(numbers);
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for (int n : numbers) {
            bw.write(n + "\n");
        }
        bw.flush();
        bw.close();
    }
}

// 시간 초과 
// System.out.println() 대신 BufferedWriter를 사용하였더니 해결!
// 주의할 점은 개행을 따로 처리해주지 않기 때문에 직접 추가해야 함!!