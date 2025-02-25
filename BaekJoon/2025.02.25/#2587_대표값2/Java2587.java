import java.io.*;

public class Java2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
        }
        br.close();


        // 정렬
        for (int i=4; i>0; i--){
            for (int j=0; j<i; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        
        // 평균
        System.out.println(sum/5);
        // 중앙값
        System.out.println(numbers[2]);
    }
}