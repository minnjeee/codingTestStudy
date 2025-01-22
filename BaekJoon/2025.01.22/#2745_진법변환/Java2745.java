import java.util.*;

public class Java2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputStrArr = sc.nextLine().split(" ");
        sc.close();

        String N = inputStrArr[0];
        int B = Integer.parseInt(inputStrArr[1]);

        int len = N.length()-1;
        int result = 0;
        for (char NOne : N.toCharArray()){
            int NOneInt = 0;
            if (NOne >= 'A' && NOne <= 'Z') {
                int a = NOne;
                NOneInt = a - 55;
            } else NOneInt = Character.getNumericValue(NOne);
            result += Math.pow(B, len) * NOneInt;
            len --;
        }

        System.out.println(result);
    }
 
}
