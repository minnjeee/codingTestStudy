import java.util.*;

public class Java1427 {
    public static void main(String[] args) {
        // 입력받기
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split("");
        sc.close();

        // 정렬
        Arrays.sort(inputs, Comparator.reverseOrder());

        // 정렬 결과를 이어붙여서 출력
        StringBuilder sb = new StringBuilder();
        for (String input : inputs) {
            sb.append(input);
        }
        System.out.println(sb.toString());
    }
}