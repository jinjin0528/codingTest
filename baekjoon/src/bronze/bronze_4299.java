package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bronze_4299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int sum = Integer.parseInt(st.nextToken());
        int minus = Integer.parseInt(st.nextToken());

        if(sum==0||minus==0){
            System.out.println(-1);
        }else{
            // 홀수면 불가능
            if ((sum + minus) % 2 != 0 || (sum - minus) % 2 != 0) {
                System.out.println(-1);
                return;
            }
            int a = (sum+minus)/2;
            int b = (sum-minus)/2;

            // 음수면 불가능
            if (a < 0 || b < 0) {
                System.out.println(-1);
            } else {
                System.out.println(a + " " + b);
            }
        }
    }
}
