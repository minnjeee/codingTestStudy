import java.util.*;
import java.io.*;

class Java11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // 입력 받기
        int [][] inputArr = new int[N][2];
        for (int i=0; i<N; i++) {
            String[] inputs = br.readLine().split(" ");
            inputArr[i][0] = Integer.parseInt(inputs[0]);
            inputArr[i][1] = Integer.parseInt(inputs[1]);
        }

        // 정렬 하기
        Arrays.sort(inputArr, (a,b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        });

        // 출력 하기
        StringBuilder sb = new StringBuilder();
        for (int[] xy : inputArr) {
            sb.append(xy[0]).append(" ").append(xy[1]).append("\n");
            
        }
        System.out.println(sb.toString());


        /*
         * 다른 풀이 : 입력 + 정렬
         * TreeMap 은 안에서 내부적으로 정렬까지 하여, 따로 정렬해주지 않아도 됨
        TreeMap<Integer, TreeSet<Integer>> inputMap = new TreeMap<>();
        for(int i=0; i<N; i++) {
            String[] inputs = br.readLine().split(" ");
            int x = Integer.parseInt(inputs[0]);
            int y = Integer.parseInt(inputs[1]);
            
            if (inputMap.containsKey(x)) {
                inputMap.get(x).add(y);
            } else {
                TreeSet<Integer> ySet = new TreeSet<>();
                ySet.add(y);
                inputMap.put(x, ySet);
            }
        }
        br.close();
    
        StringBuilder sb = new StringBuilder();
        int x;
        for (Map.Entry<Integer, TreeSet<Integer>> entry : inputMap.entrySet()) {
            x = entry.getKey();
            for (int y : entry.getValue()) {
                sb.append(x).append(" ").append(y).append("\n");
            }
        }
        System.out.println(sb.toString());
         */
    }
}

/*
 * 처음 풀이는 System.out.println()의 반복적인 호출하여 시간 초과 발생하였음
 * StringBuilder를 사용하여 한 번에 출력하였더니 해결
 */