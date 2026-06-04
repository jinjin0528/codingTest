package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code42 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        System.out.println(
                Arrays.toString(
                        Arrays.stream(str)
                                .filter(s -> !s.contains("ad"))
                                .toArray(String[]::new)
                )
        );
    }
}
