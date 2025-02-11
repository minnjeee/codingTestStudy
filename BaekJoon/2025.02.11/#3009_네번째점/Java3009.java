import java.util.*;

public class Java3009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] xs = new int[3];
        int[] ys = new int[3];
        for(int i=0; i<3; i++){
            xs[i] = sc.nextInt();
            ys[i] = sc.nextInt();
        }
        sc.close();

        int resultx = xs[0];
        int resulty = ys[0];
        if (resultx == xs[1] && resultx != xs[2]) {
            resultx = xs[2];
        } else if (resultx != xs[1] && resultx == xs[2]) {
            resultx = xs[1];
        }
        if (resulty == ys[1] && resulty != ys[2]) {
            resulty = ys[2];
        } else if (resulty != ys[1] && resulty == ys[2]) {
            resulty = ys[1];
        }
        System.out.printf("%d %d", resultx, resulty);
    }
}