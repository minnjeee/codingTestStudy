import java.util.*;

public class Java9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();

            if (num == -1) break;

            List<Integer> resultList = new ArrayList<>();
            int resultSum = 0;
            for (int i=1; i<num; i++){
                if (num%i == 0) {
                    resultList.add(i);
                    resultSum += i;
                }
            }
            
            if (resultSum == num) {
                System.out.printf("%d = ", num);
                for(int result : resultList) {
                    if (result != resultList.get(resultList.size()-1)){
                        System.out.printf("%d + ", result);
                    } else {
                        System.out.printf("%d", result);
                    }
                    
                }
            } else {
                System.out.printf("%d is NOT perfect.", num);
            }
            System.out.println();
        }
        sc.close();
    }
}
