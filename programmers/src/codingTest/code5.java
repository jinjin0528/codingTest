package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int angle =  Integer.parseInt(br.readLine());
        if(angle < 90) System.out.println(1);
        else if(angle == 90) System.out.println(2);
        else if(angle > 90 && angle < 180) System.out.println(3);
        else if(angle == 180) System.out.println(4);
    }
}
