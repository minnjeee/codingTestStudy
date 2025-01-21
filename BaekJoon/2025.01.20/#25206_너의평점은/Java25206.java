import java.util.*;
import java.io.*;

class Java25206 {
    public static void main(String[] args) throws IOException {
        String[] inputArr = new String[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<20; i++) {
            inputArr[i] = br.readLine();
        }
        br.close();

        String[] hakjum = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};

        float sum1 = 0;
        float sum2 =0;
        float index = 0;
        for(String inputOne : inputArr) {
            String[] inputs = inputOne.split(" ");

            if(inputs[2].equals("P")) continue;
            
            index = List.of(hakjum).indexOf(inputs[2]);
            if(inputs[2].equals("F")) sum1 += 0.0;
            else sum1 += Float.parseFloat(inputs[1]) * (4.5 - index * 0.5);
            sum2 += Float.parseFloat(inputs[1]);
        }

        float result = sum1 / sum2;
        System.out.printf("%.6f", result);
    }
}