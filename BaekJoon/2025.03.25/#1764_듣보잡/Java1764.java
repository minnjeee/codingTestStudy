import java.io.*;
import java.util.*;

public class Java1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<String> NSet = new HashSet<>();
        Set<String> MSet = new HashSet<>();
        for(int i=0; i<NM[0]; i++) {
            NSet.add(br.readLine());
        }
        for(int i=0; i<NM[1]; i++) {
            MSet.add(br.readLine());
        }
        br.close();

        TreeSet<String> resultSet = new TreeSet<>();
        Iterator<String> MIterator = MSet.iterator();
        while(MIterator.hasNext()) {
            String m = MIterator.next();
            if(NSet.contains(m)) {
                resultSet.add(m);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(resultSet.size()).append("\n");
        Iterator<String> resultIterator = resultSet.iterator();
        while(resultIterator.hasNext()) {
            sb.append(resultIterator.next()).append("\n");
        }
        System.out.println(sb.toString());
    }
}