package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code36 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binomial = br.readLine();
        String[] pt = binomial.split(" ");
        int a = Integer.parseInt(pt[0]);
        String op = pt[1];
        int b = Integer.parseInt(pt[2]);
        switch(op){
            case "+":
                System.out.println(a + b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            default:
                System.out.println(0);
        }
    }
}
