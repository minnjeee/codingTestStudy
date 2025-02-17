import java.util.*;

public class Java24266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        // System.out.println(Math.pow(n, 3)); // double형의 결과를 long 타입으로 캐스팅하면, 정밀도 손실 가능성 존재!!
        System.out.println(n*n*n);
        System.out.println(3);
    }
}
