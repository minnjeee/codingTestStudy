import java.util.*;

public class Java1157 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        sc.close();

        int[] intArr = new int[26];
        for (int i=0; i<inputStr.length(); i++) {
            char c = inputStr.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                intArr[c - 'A'] += 1;
            } else if (c >= 'a' && c <= 'z') {
                intArr[c - 'a'] += 1;
            }
        }

        int maxInt = 0;
        char result = '?';
        for (int i=0; i<intArr.length; i++) {
            if (intArr[i] > maxInt) {
                maxInt = intArr[i];
                result = (char) (i + (int)'A');
            } else if (intArr[i] == maxInt) {
                result = '?';
            }
        }
        System.out.println(result);

        /*
        // 처음 작성한 코드 (너무 복잡하게 코드 작성했음..!)
        String[] strArr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int[] intArr = new int[26];

        List<String> strList = List.of(strArr);
        List<Integer> intList = new ArrayList<>();

        for (int i=0; i<inputStr.length(); i++){
            String input = inputStr.substring(i, i+1).toUpperCase();

            int index = strList.indexOf(input);
            intArr[index] = intArr[index] + 1;
        }
        
        int resultIndex = 0;
        int resultInt = intArr[0];
        intList.add(intArr[0]);
        for (int i=1; i<26; i++){
            if(intArr[i] > intArr[resultIndex]){
                resultIndex = i;
                resultInt = intArr[resultIndex];
            }
            intList.add(intArr[i]);
        }

        if (Collections.frequency(intList, resultInt) > 1){
            System.out.println("?");
        } else {
            System.out.println(strList.get(resultIndex));
        }
    */
    }
}
