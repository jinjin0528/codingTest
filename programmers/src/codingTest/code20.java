package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num_str = br.readLine();
        int answer = 0;
        for(int i=0; i<num_str.length(); i++){
            answer += Integer.parseInt(num_str.substring(i, i+1));
        }
        System.out.println(answer);
    }
}
