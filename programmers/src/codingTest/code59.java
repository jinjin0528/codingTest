package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code59 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_str = br.readLine();
        int m = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=c-1;i<my_str.length();i+=m){
            sb.append(my_str.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
