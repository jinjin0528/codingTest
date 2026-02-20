package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze_10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        for(int i=0;i<5;i++){
            int score = Integer.parseInt(br.readLine());
            sum+=Math.max(score,40);    // 점수가 40보다 작으면 40, 40보다 크면 점수 그대로
        }
        System.out.println(sum/5);
    }
}
