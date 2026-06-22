package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code58 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        int[] res = new int[start-end +1];
        for(int i=0;i<res.length;i++){
            res[i] = start-i;
        }
        System.out.println(Arrays.toString(res));
    }
}
