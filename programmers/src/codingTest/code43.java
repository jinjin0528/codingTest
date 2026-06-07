package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code43 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String str = my_str.substring(my_str.length()-n);
        System.out.println(str);
    }
}
