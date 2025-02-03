import java.util.*;

public class Java1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numArr = new int[N];
        for (int i=0; i<N; i++) numArr[i] = sc.nextInt();
        sc.close();

        int result = 0;
        for (int num : numArr) {
            boolean plusYn = true;
            if (num == 1) continue;
            else if (num == 2) result++;
            else {

                for(int i=2; i<num; i++) {
                    if (num % i == 0) {
                        plusYn = false;
                        break;
                    }
                }
                if (plusYn) result++;
            }
        }
        System.out.println(result);
    }
}
