import java.io.*;
import java.util.*;

public class Java1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // N M
        Set<String> NSet = new HashSet<>(Arrays.asList(br.readLine().split(" ")));
        Set<String> MSet = new HashSet<>(Arrays.asList(br.readLine().split(" ")));        
        br.close();

        int num = 0;
        Iterator<String> NIter = NSet.iterator();
        while(NIter.hasNext()) {
            if (MSet.contains(NIter.next())) num++;
        }
        System.out.println(NM[0] + NM[1] - 2*num);
    }
}
