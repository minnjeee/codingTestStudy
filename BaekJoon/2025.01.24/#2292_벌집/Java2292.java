import java.util.Scanner;

public class Java2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int result = 1;
        
        int idx = 0;
        int min = 2;
        int max = 1;
        if(num == 1) {
            System.out.println(result);
            return;
        }
        // 2 + 6 + 6*2 ... + 6*n < num < 7 + 6*2 + 6*3 + ... + 6*(n+1)
        while(true){
            min += 6 * idx;
            max += 6 * (idx+1);
            
            result ++;
            if (min <= num && num <= max) {
                System.out.println(result);
                return;
            }
            idx++;
        }
    }
}