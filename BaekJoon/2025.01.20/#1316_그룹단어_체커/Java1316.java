import java.io.*;

public class Java1316{
    public static void main(String[] args){
        int n = 0;
        String[] words = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            n = Integer.parseInt(br.readLine());
            words = new String[n];
            for (int i=0; i<n; i++) {
                words[i] = br.readLine();
            }
        } catch (IOException e) {
            // TODO: handle exception
        }

        int result = 0;
        char[] currentWord = null;
        
        for (String word : words) { // ["happy", "new", "year"]
            currentWord = new char[word.length()];
            int index = 0;
            boolean resultStr = true;
            for (char c : word.toCharArray()) { // ["h", "a", "p", "p", "y"]
                currentWord[index] = c;
                if (index >= 2) {
                    if (currentWord[index-1] != currentWord[index]) {
                        for (int i=0; i<index-1; i++) {
                            if (currentWord[i] == currentWord[index]) {
                                resultStr = false;
                                break;
                            }
                        }
                    } else continue;
                }
                if (!resultStr) break;
                index += 1;

            }
            if (resultStr) result += 1;
        }
        
        System.out.println(result);
    }
    
}