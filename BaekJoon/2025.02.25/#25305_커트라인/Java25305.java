import java.io.*;

public class Java25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");
        int N = Integer.parseInt(line1[0]);
        int k = Integer.parseInt(line1[1]);
        String[] line2 = br.readLine().split(" ");
        int[] xArr = new int[N];
        for(int i=0; i<N; i++) {
            xArr[i] = Integer.parseInt(line2[i]);
            System.out.println(xArr[i]);
        }
        br.close();

        // 정렬
        for(int i=N-1; i>N-k-1; i--) {
            for(int j=0; j<i; j++) {
                if(xArr[j] > xArr[j+1]) {
                    int temp = xArr[j];
                    xArr[j] = xArr[j+1];
                    xArr[j+1] = temp;
                }
            }
        }

        // 뒤에서 k번째 수
        System.out.println(xArr[N-k]);
    }
}
