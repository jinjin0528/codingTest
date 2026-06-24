package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code60 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myStr = br.readLine();
        String[] res = myStr.split("x");
        String[] ans = Arrays.stream((res))
                .filter(s->!s.isEmpty())
                .sorted()
                .toArray(String[]::new);
        System.out.println(Arrays.toString(ans));
    }
}
