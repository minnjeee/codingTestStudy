import java.io.*;

public class java3003 {
    public static void main(String[] args) throws IOException {
        int[] basicArray = {1,1,2,2,2,8};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArray = br.readLine().split(" ");
        br.close();

        for (int i=0; i<basicArray.length; i++) {
            System.out.print(basicArray[i] - Integer.parseInt(inputArray[i]) + " ");
        }
    }
}