import java.io.*;

class Java2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[][] colorArea = new int[100][100];
        for (int i=0; i<num; i++) {
            String[] inputOne = br.readLine().split(" ");

            int x = Integer.parseInt(inputOne[0]);
            int y = Integer.parseInt(inputOne[1]);

            for (int j=x; j<x+10; j++) {
                for(int k=y; k<y+10; k++){
                    colorArea[j][k] = 1;
                }
            } 
        }
        br.close();

        int result = 0;
        for (int i=0; i<100; i++) {
            for (int j=0; j<100; j++) {
                if (colorArea[i][j] == 1) {
                    result += 1;
                }
            }
        }
        System.out.println(result);        
    }
}