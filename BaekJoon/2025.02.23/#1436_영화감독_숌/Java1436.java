import java.io.*;

class Java1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        // 666부터 차례대로 666이 포함되어 있는지 확인 
        // 포함되어 있으면 1씩 증가 시켜서, 입력받은 수가 되면 해당 수를 반환!
        int num = 666;
        int result = 0;

        while(result!=n) {
            String numStr = Integer.toString(num);
            if(numStr.contains("666")) result++;
            num++;
        }
        num--;
        System.out.println(num);
    }
}