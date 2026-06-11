package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code47 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String pat = br.readLine();
        str = str.toLowerCase();
        pat = pat.toLowerCase();
        System.out.println(str.contains(pat)? 1:0);
    }
}
