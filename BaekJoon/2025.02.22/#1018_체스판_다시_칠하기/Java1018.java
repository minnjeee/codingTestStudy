import java.util.*;

public class Java1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        String[][] str2Arr = new String[N][M];
        for(int i=0; i<N; i++) {
            str2Arr[i] = sc.nextLine().split("");
        }
        sc.close();
    
        int result = 64;
        

        for (int startRow=0; startRow<=N-8; startRow++) {
            for (int startCol=0; startCol<=M-8; startCol++) {
                int resultB = 0;
                int resultW = 0;
                int currentRow = 1;
                int currentCol = 1;
                for (int i=startRow; i<startRow+8; i++){
                    for (int j=startCol; j<startCol+8; j++) {
                        
                        // 1. B로 시작
                        if (
                            (currentRow%2!=0 && currentCol%2!=0) && !(str2Arr[i][j].equals("B"))
                            || (currentRow%2!=0 && currentCol%2==0) && !(str2Arr[i][j].equals("W"))
                            || (currentRow%2==0 && currentCol%2!=0) && !(str2Arr[i][j].equals("W"))
                            || (currentRow%2==0 && currentCol%2==0) && !(str2Arr[i][j].equals("B"))
                        ) {
                            resultB++;
                        }
                        currentCol++;
                    }
                    currentRow++;
                }
                // 2. W로 시작
                resultW = 64 - resultB;

                int minResult = Math.min(resultB, resultW);
                if (minResult < result) result = minResult;
            }            
        }
        
        System.out.println(result);
    }
}
