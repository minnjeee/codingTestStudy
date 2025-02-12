import java.io.*;

public class Java9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long xMax = Long.MIN_VALUE;
        long xMin = Long.MAX_VALUE;
        long yMax = Long.MIN_VALUE;
        long yMin = Long.MAX_VALUE;

        for (int i=0; i<n; i++) {
            String[] readStr = br.readLine().split(" ");
            if (Long.parseLong(readStr[0]) > xMax) {
                xMax = Long.parseLong(readStr[0]);
            }
            if (Long.parseLong(readStr[0]) < xMin) {
                xMin = Long.parseLong(readStr[0]);
            }
            if (Long.parseLong(readStr[1]) > yMax) {
                yMax = Long.parseLong(readStr[1]);
            }
            if (Long.parseLong(readStr[1]) < yMin) {
                yMin = Long.parseLong(readStr[1]);
            }
        }
        br.close();

        Long result = (xMax-xMin) * (yMax-yMin);
        System.out.println(result);
    }
}