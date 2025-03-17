import java.io.*;
import java.util.Set;

public class Java18015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N개의 정수 입력받아서 Set 선언
        Integer.parseInt(br.readLine()); // N    
        Set<String> set = Set.of(br.readLine().split(" "));

        // M개의 정수를 입력받아서 해당 값이 set에 포함되어 있는지 판단하여 출력
        Integer.parseInt(br.readLine()); // M
        String[] MArr = br.readLine().split(" ");
        for (String mItem : MArr) {
            System.out.println(set.contains(mItem) ? 1 : 0);
        }
        br.close();
    }
}