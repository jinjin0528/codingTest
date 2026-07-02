package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code65 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myStr = br.readLine();
        String pre = br.readLine();
        if(myStr.startsWith(pre)){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}
