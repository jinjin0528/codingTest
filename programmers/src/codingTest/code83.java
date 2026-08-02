package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code83 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myString = br.readLine();
        String pat = br.readLine();
        int answer = 0;
            for (int i = 0; i <= myString.length() - pat.length(); i++) {
                if (myString.substring(i).startsWith(pat)) {
                    answer++;
                }
            }
        System.out.println(answer);
    }
}
