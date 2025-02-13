import java.util.*;

public class Java5073 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            Integer[] inputs = new Integer[3];
            for (int i=0; i<3; i++) {
                inputs[i] = sc.nextInt();
            }
            
            Arrays.sort(inputs, Comparator.reverseOrder());
            
            if (inputs[0] == 0) {
                break;
            }
            
            if (inputs[0] >= inputs[1] + inputs[2]) {
                System.out.println("Invalid");
            } else {
                if (inputs[0].equals(inputs[1]) && inputs[1].equals(inputs[2])) {
                    System.out.println("Equilateral");
                } else if (inputs[0].equals(inputs[1]) || inputs[1].equals(inputs[2]) || inputs[0].equals(inputs[2])) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }

        }
        sc.close();
    }
}