import java.util.Scanner;

public class Java1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int a = 1;
        int b = 1;
        boolean isToDown = true;
        for(int i=0; i<num; i++){
            if(i==0) {
                continue;
            } else if(i==1) {
                b++;
                continue;
            }
            if(isToDown){ // true - 분모는 작아지고, 분자는 커짐짐
                if (b==1) {
                    a++;
                    isToDown = false;
                    continue;
                }
                b--;
                a++;
                
            } else {
                if (a==1) {
                    b++;
                    isToDown = true;
                    continue;
                }
                b++;
                a--;
            }

        }
        System.out.println(a + "/" + b);
    }
}
