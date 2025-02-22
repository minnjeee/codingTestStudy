import java.util.*;

class Java19532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        sc.close();
        
        boolean breakYn = false;
        for (int x=-999; x<=999; x++) {
            for (int y=-999; y<=999; y++) {
                if ((a*x + b*y == c) && (d*x + e*y == f)) {
                    System.out.printf("%d %d", x, y);
                    breakYn = true;
                    break;
                }
            }
            if (breakYn) break;
        }
    }
}