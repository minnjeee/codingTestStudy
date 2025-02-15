import java.util.*;

public class Java14215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();

        Integer[] numbers = new Integer[] { x, y, z };
        Arrays.sort(numbers);

        int a = numbers[0] + numbers[1];
        if (numbers[2] >= a) {
            System.out.println(a + a - 1);
        } else {
            System.out.println(a + numbers[2]);
        }
    }
}
