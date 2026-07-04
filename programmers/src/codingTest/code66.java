package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code66 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = str.length();
        String[] res = new String[n];

        for(int i=0;i<n;i++){
            res[i] = str.substring(i);
        }
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));

    }
}
