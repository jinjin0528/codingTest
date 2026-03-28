package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bronze_1598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int A_x = (A-1)/4;
        int A_y = (A-1)%4;
        int B_x = (B-1)/4;
        int B_y = (B-1)%4;

        int xx = Math.abs(A_x - B_x);
        int yy = Math.abs(A_y - B_y);

        System.out.println(xx + yy);
    }
}
