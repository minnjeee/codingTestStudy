import java.util.Scanner;

public class Java2501 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        for (int i=1; i<=N; i++) {
            if (N % i == 0) K--;
            if (K == 0) {
                System.out.println(i);
                break;
            }
        }
        if (K > 0) System.out.println(0);

    }
}
