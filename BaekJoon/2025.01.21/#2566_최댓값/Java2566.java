import java.io.*;

public class Java2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] inputArr = new int[9][9];
        for (int i=0; i<9; i++) {
            String[] input = br.readLine().split(" ");
            for (int j=0; j<9; j++) {
                inputArr[i][j] = Integer.parseInt(input[j]);
            }
        }
        br.close();

        int max = 0;
        int raw = 1;
        int col = 1;
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                if (inputArr[i][j] > max) {
                    max = inputArr[i][j];
                    raw = i + 1;
                    col = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(raw + " " + col);
    }
}
