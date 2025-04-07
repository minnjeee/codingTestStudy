import java.util.*;
import java.io.*;

public class Java2485 {
    public static long gcd(long a, long b) {
        while(b!=0) {
            long temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] nums = new Integer[n]; // 가로수 위치
        int[] diffs = new int[n-1]; // 가로수 간격
        for(int i=0; i<n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            if (i!=0) diffs[i-1] = nums[i] - nums[i-1];
        }
        br.close();

        // 가로수 간격의 최소공배수 구하기
        int diffNum = diffs[0];
        for(int diff : diffs) {
            diffNum = (int) gcd(diffNum, diff);
        }

        // 심어야 하는 가로수 개수 구하기
        // int result = 0;
        // Set<Integer> numsSet = new HashSet<>(Arrays.asList(nums));
        // for(int i=nums[0]; i<nums[n - 1]; i+=diffNum) {
        //     if(!numsSet.contains(i)) result++;
        // }
        int result = ((nums[n-1] - nums[0]) / diffNum + 1) - n;
        System.out.println(result);
    }
}

/*
 * << 오답노트 >>
 * 메모리 초과 발생
 * 원인 : Set.contains()를 반복 호출
 * - 가로수 시작점과 끝점의 간격이 매우 크고, 가로수 간격이 작으면 불필요한 반복 발생
 * - Set.contains()는 평균적으로 O(1) 시간으로 빠르게 처리되지만, 
 *  자바에서는 Integer 박싱/언박싱이 반복적으로 일어나며, 시간/메모리 양쪽에 부담을 주게 됨
 * 해결방법 : 수학적 계산으로 해결가능한 문제이므로, Set 사용할 필요 없이 해결 가능하다
 */