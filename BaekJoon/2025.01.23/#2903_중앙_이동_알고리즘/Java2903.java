import java.util.Scanner;

public class Java2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int nemolenNum = 1;
        int dotNum = 4;
        for (int i=0; i<num; i++){
            dotNum += 5;
            if (nemolenNum >=2) {
                dotNum += (nemolenNum-1)*2 * 4;
                dotNum += (nemolenNum-1)*(nemolenNum-1)*3;
            }
            nemolenNum *= 2;
        }

        System.out.println(dotNum);
    }
}
