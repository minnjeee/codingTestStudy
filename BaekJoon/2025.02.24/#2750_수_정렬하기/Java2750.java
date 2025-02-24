import java.io.*;

public class Java2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        for(int i=0; i<N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        for(int repeat=N-1; repeat>=0; repeat--) {
            for (int i=0; i<repeat; i++) {
                if (numbers[i] > numbers[i+1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
            }    
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }

}
