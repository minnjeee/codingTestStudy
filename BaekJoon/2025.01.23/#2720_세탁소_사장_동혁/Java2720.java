import java.util.*;

public class Java2720 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[] prices = new int[num];
        for (int i=0; i<num; i++) {
            prices[i] = Integer.parseInt(sc.nextLine());
        }
        sc.close();
        
        int[] ps = {25, 10, 5, 1};
        for (int price : prices) {
            for (int p : ps) {
                System.out.printf("%d ", (int)price/p);
                price = price % p;
            }
            System.out.println();
        }
    }
}