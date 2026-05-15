package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code25 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        boolean flag = Boolean.parseBoolean(br.readLine());
        int answer = 0;
        if(flag){
            answer = a+b;
        } else {
            answer = a-b;
        }
        System.out.println(answer);
    }
}
