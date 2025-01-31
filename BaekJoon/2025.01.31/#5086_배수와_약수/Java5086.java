import java.util.Scanner;

public class Java5086 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String[] numStr = sc.nextLine().split(" ");
            int num1 = Integer.parseInt(numStr[0]);
            int num2 = Integer.parseInt(numStr[1]);
            if (num1 == 0 && num2 == 0) break;
            if (num1 <= num2 && num2%num1 == 0) System.out.println("factor");
            else if (num1 >= num2 && num1%num2 == 0) System.out.println("multiple");
            else System.out.println("neither");
        }
        sc.close();
    }
}