import java.util.*;

/* 1번째 풀이
public class Java2941 {
    public static void main(String[] args){
        String[] croatias = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        sc.close();
        
        int result = 0;
        String newInputStr = "";
        int num = 0;
        for (String croatia : croatias) {
            if(inputStr.contains(croatia)){
                newInputStr = inputStr.replace(croatia, " ");
                num = (inputStr.replace(" ", "").length() - newInputStr.replace(" ", "").length())/croatia.length();
                result = result + num;
                inputStr = newInputStr;
            }
        }

        result = result + inputStr.replace(" ","").length();
        System.out.println(result);

    }

}
 */

 /* 2번째 풀이 */
public class Java2941 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        sc.close();

        String[] croatias = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String croatia : croatias) {
            inputStr = inputStr.replace(croatia, "x");
        }

        System.out.println(inputStr.length());
    }
}
