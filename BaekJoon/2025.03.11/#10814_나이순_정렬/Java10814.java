import java.io.*;
import java.util.*;

public class Java10814 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 나이를 Key로, List<이름>를 Value로
        Map<Integer, List<String>> inputMap = new HashMap<>();
        for (int i=0; i<N; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            if(inputMap.containsKey(age)) {
                inputMap.get(age).add(name);
            } else {
                inputMap.put(age, new ArrayList<String>(Arrays.asList(name)));
            }
        }
        br.close();

        // 출력
        StringBuffer sb = new StringBuffer();
        for (int i=1; i<=200; i++) {
            if (inputMap.containsKey(i)) {
                List<String> inputList = inputMap.get(i);
                for (String input : inputList) {
                    sb.append(i).append(" ").append(input).append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}