import java.util.*;

public class Java10101 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[3];
        for (int i=0; i<3; i++) {
            inputs[i] = sc.nextInt();
        }
        sc.close();

        if ((inputs[0] + inputs[1] + inputs[2]) == 180) {
            if (inputs[0] == inputs[1] && inputs[1] == inputs[2]) System.out.println("Equilateral");
            else if (inputs[0] == inputs[1] || inputs[1] == inputs[2] || inputs[0] == inputs[2]) System.out.println("Isosceles");
            else System.out.println("Scalene");
        } else {
            System.out.println("Error");
        }
    }
}