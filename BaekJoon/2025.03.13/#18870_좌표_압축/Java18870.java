import java.io.*;
import java.util.*;

public class Java18870 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] inputsStr = br.readLine().split(" ");
        br.close();

        // 복사 (원본)
        int[] inputs = Arrays.stream(inputsStr).mapToInt(Integer::parseInt).toArray();
        // 배열 정렬
        int[] sortedInputs = Arrays.stream(inputs)
                                    .distinct() // 중복 제거
                                    .sorted()   // 오름차순 정렬
                                    .toArray();

        // 압축 구하기
        Map<Integer, Integer> resultMap = new HashMap<>();
        for(int i=0; i<sortedInputs.length; i++){
            resultMap.put(sortedInputs[i],i); // 원본 값과 압축 값을 Key-Value로 매핑
        }
        StringBuilder sb = new StringBuilder();
        for(Integer input : inputs) {
            sb.append(resultMap.get(input)).append(" ");
        }
        System.out.println(sb.toString());
    }
}