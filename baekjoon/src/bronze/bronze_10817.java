package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bronze_10817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int []A = new int[3];
        A[0] = Integer.parseInt(st.nextToken());
        A[1] = Integer.parseInt(st.nextToken());
        A[2] = Integer.parseInt(st.nextToken());
        Arrays.sort(A);
        System.out.println(A[1]);
    }
}
