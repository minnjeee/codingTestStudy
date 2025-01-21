import java.io.*;

public class Java2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputNM = br.readLine().split(" ");
        int N = Integer.parseInt(inputNM[0]);
        int M = Integer.parseInt(inputNM[1]);

        String[] inputA = new String[N];
        String[] inputB = new String[N];
        for (int i = 0; i < N ; i++) inputA[i] = br.readLine();
        for (int i = 0; i < N ; i++) inputB[i] = br.readLine();
        br.close();

        for (int i = 0; i < N ; i++ ) {
            String[] elementA = inputA[i].split(" ");
            String[] elementB = inputB[i].split(" ");
            for(int j = 0 ; j < M ; j++ ) {
                System.out.printf("%d ", Integer.parseInt(elementA[j]) + Integer.parseInt(elementB[j]));
            }
            System.out.println();
        }
    }
}