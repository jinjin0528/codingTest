package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code41 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_str = br.readLine();
        String str = my_str.replaceAll("\\s+"," ").trim();
        System.out.println(Arrays.toString(str.split(" ")));
    }
}
