import java.io.*;
import java.util.*;

public class Java1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        Map<Integer, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i=0; i<NM[0]; i++) {
            String name = br.readLine();
            map1.put(i+1, name);
            map2.put(name, i+1);
        }

        StringBuffer sb = new StringBuffer();
        for (int i=0; i<NM[1]; i++) {
            String key = br.readLine();
            if (key.matches("[0-9]+")) {
                sb.append(map1.get(Integer.parseInt(key))).append("\n");
            } else {
                sb.append(map2.get(key)).append("\n");
            }
        }
        br.close();
        System.out.println(sb.toString());


    }
}