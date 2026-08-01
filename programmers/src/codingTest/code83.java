package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code83 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public int solution(String myString, String pat) {
            int answer = 0;
            for (int i = 0; i <= myString.length() - pat.length(); i++) {
                if (myString.substring(i).startsWith(pat)) {
                    answer++;
                }
            }
            return answer;
    }
}
