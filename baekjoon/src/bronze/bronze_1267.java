package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bronze_1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int yeongsik = 0; // 영식 요금제 총합
        int minsik = 0;   // 민식 요금제 총합

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int s = Integer.parseInt(st.nextToken());

            // 영식 요금 계산: 30초마다 10원
            yeongsik += ((s / 30) + 1) * 10;

            // 민식 요금 계산: 60초마다 15원
            minsik += ((s / 60) + 1) * 15;
        }

        // 결과 비교 및 출력
        if (yeongsik < minsik) {
            System.out.println("Y " + yeongsik);
        } else if (minsik < yeongsik) {
            System.out.println("M " + minsik);
        } else {
            System.out.println("Y M " + yeongsik);
        }
    }
}
