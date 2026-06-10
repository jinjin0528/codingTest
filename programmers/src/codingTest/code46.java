package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code46 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double flo = Double.parseDouble(br.readLine());
        int ans = (int)flo;
        System.out.println(ans);
    }
}
