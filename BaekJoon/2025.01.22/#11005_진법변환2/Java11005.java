import java.util.*;

public class Java11005 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] NB = sc.nextLine().split(" ");
        sc.close();

        int N = Integer.parseInt(NB[0]);
        int B = Integer.parseInt(NB[1]);

        String result = "";
        char c;
        int a = N / B; // 몫
        int b = N % B; // 나머지
        while(true) {
            if (b >= 10 && b <= 35){
                c = (char) (b + 55);
                result =  Character.toString(c) + result;
            } else {
                result = Integer.toString(b) + result; 
            }
            if (N < B) break;
            N = a;
            a = N / B; // 몫
            b = N % B; // 나머지
        }
        System.out.println(result);
    }
}
