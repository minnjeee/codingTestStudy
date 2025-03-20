import java.io.*;
import java.util.*;

public class Java7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> names = new HashSet<String>();
        for(int i=0; i<N; i++) {
            String[] inputs = br.readLine().split(" ");
            if (inputs[1].equals("enter")) {
                names.add(inputs[0]);
            } else {
                names.remove(inputs[0]);
            }
        }
        br.close();

        List<String> namesList = new ArrayList<>(names);
        Collections.sort(namesList, (a, b) -> b.compareTo(a));

        StringBuffer sb = new StringBuffer();
        for (String name : namesList) {
            sb.append(name).append("\n");
        }
        System.out.println(sb.toString());
    }
    /* 
        오답노트
        - `String`은 비교 시 `==` 연산자가 아닌 `equals()` 를 이용해야 함
        - `==` 는 참조를 비교하고, `equals()` 는 값을 비교
        - `==` 연산자는 두 객체의 메모리 주소(참조)가 같은지를 비교하여, 같은 값을 가지더라고 다른 메모리 위치에 저장되어 있다면 `false`를 반환
        - `equals()` 메소드는 `String` 객체가 가지는 실제 문자열 값을 비교하여, 두 객체의 참조가 다르더라도 문자열 값이 같으면 `true`를 반환
     */
}