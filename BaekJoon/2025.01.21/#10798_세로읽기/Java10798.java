import java.io.*;

public class Java10798 {
    public static void main(String[] args)throws IOException {
        String[] inputList = new String[5];
        int repeatNum = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<5; i++){
            inputList[i] = br.readLine();
            if (inputList[i].length() > repeatNum) repeatNum = inputList[i].length();
        }
        br.close();

        for (int j=0; j<repeatNum; j++) {
            for (int i=0; i<5; i++) {
                if (inputList[i].length() > j) {
                    System.out.printf("%s", inputList[i].substring(j,j+1));
                } else continue;
            }
        }
    }
}