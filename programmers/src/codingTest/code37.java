package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code37 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myString = br.readLine();
        String[] pt = myString.split("x",-1);
        int[] ans = new int[pt.length];
        for(int i = 0; i<pt.length; i++){
            ans[i] = pt[i].length();
        }
        System.out.println(Arrays.toString(ans));
    }
}
