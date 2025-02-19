import java.util.*;

public class Java2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] numbers = new int[N];
        for(int i=0; i<N; i++){
            numbers[i] = sc.nextInt();
        }
        sc.close();
        
        int result = 0;
        boolean continueYn = true;
        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    int sumNum = numbers[i]+numbers[j]+numbers[k];
                    if(sumNum <= M && sumNum > result) result = sumNum;
                }
            }
        }
        System.out.println(result);
    }
}