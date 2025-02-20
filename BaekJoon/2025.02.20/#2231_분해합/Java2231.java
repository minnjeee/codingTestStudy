import java.util.*;

public class Java2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();

		/* 기존 풀이 - 입력 수의 자릿수만큼 9를 곱해서 뺀 수를 생성자의 최솟값으로 판단 (근데 틀림.. 반례를 아직 찾지 못함)
		long N_copy = N;
		int num = 1;
		while (true) {
            if ((long)(N_copy/10) == 0) break;
			num++;
			N_copy = N_copy%10;
		}
		long minM = (N-9*num > 0) ? N-9*num : 1;
		*/
        
        long result = 0;
		for (long i=1; i<N; i++) {
			long constructor = i; 
			long compareNum = i;
			long addNum = i;

			while(true) {
				compareNum += addNum%10;
				if ((addNum/10)== 0) break;
				addNum = (addNum/10);
			}
			if (compareNum == N) { 
				result = constructor;
				break;
			}
		}
		System.out.println(result);
	}
}