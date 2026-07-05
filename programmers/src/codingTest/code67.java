package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code67 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int ans = 0;
        for(int i=0;i<num.length();i++){
            ans += num.charAt(i) - '0';
        }
        System.out.println(ans%9);

    }
}
