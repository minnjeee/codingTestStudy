import java.util.*;

class Java11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for(int i=2 ;; i++) {
            while (N % i == 0) {
                System.out.println(i);
                N = (N/i); // 자동으로 int로 캐스팅
                if (N == 1) break;
            }
            if (N == 1) break;
        }
    }
}