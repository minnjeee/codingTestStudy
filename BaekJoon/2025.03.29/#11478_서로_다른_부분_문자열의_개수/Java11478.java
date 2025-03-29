import java.util.*;

public class Java11478 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        Set<String> set = new HashSet<>();
        int n =0;
        for(int i=1; i<input.length()+1; i++) {   //i = 1,2,3,4,5 (몇글자씩 읽을지)
            n = 0;
            for(int j=input.length()-i+1; j>0; j--){ // j = 6-i = 5,4,3,2,1 (몇번 반복하는지)
                set.add(input.substring(n, n+i));
                n++;
            }
        }

        System.out.println(set.size());
    }
}
