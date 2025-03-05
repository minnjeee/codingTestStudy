import java.util.*;
import java.io.*;

class Java11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int [][] inputArr = new int[N][2];
        for (int i=0; i<N; i++) {
            String[] inputs = br.readLine().split(" ");
            inputArr[i][0] = Integer.parseInt(inputs[0]);
            inputArr[i][1] = Integer.parseInt(inputs[1]);
        }

        Arrays.sort(inputArr, (a,b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int[] xy : inputArr) {
            sb.append(xy[0]).append(" ").append(xy[1]).append("\n");
            
        }
        System.out.println(sb.toString());
    }
}
