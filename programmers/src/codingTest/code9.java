package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int answer = 0;
        if(a%2!=0 && b%2!=0) {
            answer = (int)Math.pow(a, 2) + (int)Math.pow(b, 2);
        }else if(a%2!=0 || b%2!=0) {
            answer = 2*(a+b);
        }else if(a%2==0 && b%2==0){
            answer = Math.abs(a - b);
        }
        System.out.println(answer);
    }
}
