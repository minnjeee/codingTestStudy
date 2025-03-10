import java.util.*;
import java.io.*;

public class Java1181 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> inputs = new ArrayList<String>();
        String input = "";
        for (int i=0; i<N; i++) {
            input = br.readLine();
            // 리스트에 입력받은 문자열이 있는 경우, 추가하지 않음
            if (inputs.contains(input)) continue;
            inputs.add(input);
        }
        br.close();
        
        // 정렬
        Collections.sort(inputs, (a,b) -> {
            if (a.length() == b.length()) return a.compareTo(b);
            return a.length() - b.length();
        });

        // 출력
        StringBuilder sb = new StringBuilder();
        for (String s : inputs) {
            sb.append(s).append("\n");
        }
        System.out.println(sb.toString());
    }
}