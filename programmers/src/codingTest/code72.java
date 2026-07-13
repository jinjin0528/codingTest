package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code72 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a =  Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        if(a==b && b==c) {
            System.out.println((a+b+c)*(a*a + b*b + c*c)*(a*a*a + b*b*b + c*c*c));
        } else if(a==b || b==c || c==a) {
            System.out.println((a+b+c)*(a*a + b*b + c*c));
        } else {
            System.out.println(a+b+c);
        }
    }
}
