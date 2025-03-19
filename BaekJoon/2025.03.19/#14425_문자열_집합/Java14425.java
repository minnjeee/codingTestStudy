import java.io.*;
import java.util.*;

public class Java14425 {    
    public static void main(String[] args) {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int[] NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            // N만큼 입력받기
            Set<String> NStrs = new HashSet<>();
            for (int i=0; i<NM[0]; i++) {
                NStrs.add(br.readLine());
            }
            // M만큼 입력받기
            String[] MStrs = new String[NM[1]];
            for (int i=0; i<NM[1]; i++) {
                MStrs[i] = br.readLine();
            }

            // MStrs 의 문자열들이 NStrs에 포함되어 있는지 판단하기
            int result = 0;
            for(String Mstr : MStrs) {
                if(NStrs.contains(Mstr)) result++;
            }

            System.out.println(result);
        } catch (IOException e) {}
    }
}
