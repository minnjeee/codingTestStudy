import java.util.*;

class Java2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int result = 0; // 봉지 개수

        int n5 = N / 5; // 5로 나눈 몫 (5킬로크램 봉지 가능한 최대 개수)
        for(int i=n5; i>=0; i--){
            int N_copy = N;
            N_copy = N_copy - i * 5; // 5킬로그램 봉지를 i개 사용한 경우 남은 설탕 킬로그램

            if (N_copy % 3 != 0) {
                // 3으로 나누어 떨어지지 않는 경우 -> 5킬로그램 봉지 개수 줄여서 다시 판단
                continue;
            } else if (N_copy == 0) {
                // 남은 설탕 킬로그램이 0인 경우 = 5킬로그램 봉지만으로 가능한 경우
                result = i;
                break;
            }else {
                // 3으로 나누어 떨어지는 경우 = 5킬로그램 봉지와 3킬로그램 봉지 모두 사용한 경우
                int n3 = N_copy / 3;
                result = n3 + i;
                break;
            }
        }
        
        if (result == 0) System.out.println(-1); // 5킬로그램과 3킬로그램 봉지로 가능하지 않은 경우
        else System.out.println(result); // 가능한 경우
    }
}