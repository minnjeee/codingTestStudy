import java.io.*;
import java.util.*;

public class Java10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer.parseInt(br.readLine()); // N
        int[] NArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : NArr) {
            if(map.containsKey(n)) {
                map.put(n, map.get(n)+1);
            } else {
                map.put(n, 1);
            }
        }
        Integer.parseInt(br.readLine()); // M
        int[] MArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        br.close();

        StringBuffer sb = new StringBuffer();
        for(int m : MArr) {
            if (map.containsKey(m)) sb.append(map.get(m)).append(" ");
            else sb.append("0 ");
        }
        System.out.println(sb.toString());
    }
}
