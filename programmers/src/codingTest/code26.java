package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code26 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String control = br.readLine();
        for(int i =0;i<control.length();i++){
            char c = control.charAt(i);
            if(c == 'w') {
                n += 1;
            }
            else if(c == 's') {
                n -= 1;
            }
            else if(c == 'd') {
                n += 10;
            }
            else if(c == 'a') {
                n -= 10;
            }
        }
        System.out.print(n);
    }
}
