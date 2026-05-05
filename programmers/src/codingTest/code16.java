package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        String answer = "";
        for(int i=0;i<str1.length();i++){
            answer += String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i));
        }
        System.out.println(answer);
    }
}
