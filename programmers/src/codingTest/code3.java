package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String answer = "";
        for(int i = 0; i<my_string.length(); i++){
            for(int j = 0; j<n; j++){
                answer += my_string.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
