import java.util.*;

public class Java10988 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        sc.close();
        
        StringBuffer sb = new StringBuffer(word);
        String wordReverse = sb.reverse().toString();
        // String wordReverse = "";
        // for (int i=0; i<word.length(); i++) {
        //     wordReverse = word.charAt(i) + wordReverse;
        // }
        
        if(word.equals(wordReverse)){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        
    }
    
}
