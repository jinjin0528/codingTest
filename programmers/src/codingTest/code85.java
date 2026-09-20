package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code85 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] ans = new int[52];

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c>='A' && c<='Z'){
                ans[c-'A']++;
            } else if(c>='a' && c<= 'z'){
                ans[c-'a' + 26]++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
