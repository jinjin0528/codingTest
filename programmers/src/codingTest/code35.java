package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code35 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myString = br.readLine();
        String pat = br.readLine();
        String mod = myString.replace("A", "a").replace("B","A").replace("a","B");
        System.out.println(mod.contains(pat) ? 1:0);
                  }
}
