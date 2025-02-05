import java.util.*;

public class Java1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        sc.close();

        int n1 = Math.min(x, w-x);
        int n2 = Math.min(y, h-y);
        System.out.println(Math.min(n1,n2));
    }
}
