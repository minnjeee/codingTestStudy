import java.util.*;

public class Java2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        sc.close();

        int minNum = 0;
        int sumNums = 0;
        for(int i=M; i<N+1; i++) {
            if (i == 1) continue;
            boolean plusYn = true;
            for(int j=2; j<i; j++) {
                if (i % j == 0) {
                    plusYn = false;
                    break;
                }
            }
            if (plusYn) {
                sumNums += i;
                if (minNum == 0) minNum = i;
            }
        }
        if (sumNums == 0) System.out.println(-1);
        else System.out.printf("%d\n%d", sumNums, minNum);
    }
}