import java.io.*;

public class java2444 {
    public static void main(String[] args){
        int n = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            //
        }

        for (int i=1; i<=n; i++) {
            System.out.println(" ".repeat(n-i) + "*".repeat(2*i - 1));
        }
        for (int i=n-1; i>=1; i--) {
            System.out.println(" ".repeat(n-i) + "*".repeat(2*i - 1));
        }
    }
}