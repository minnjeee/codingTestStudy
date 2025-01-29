import java.util.*;

public class Java2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        sc.close();

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);


        /*
         * 첫번째 풀이 => 시간 초과
         int h = 0;
         int day = 0;
         for (int i=0; i<V; i++){
             day ++;
             h += A;
             if (h >= V) break;
             h -= B;
         }
         System.out.println(day);
         */

        int result = (int) Math.ceil((double) (V - B) / (A - B));
        System.out.println(result);
    } 
}