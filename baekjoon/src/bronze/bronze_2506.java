package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bronze_2506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] result =  new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            result[i] = Integer.parseInt(st.nextToken());
        }
        int currentScore = 0; // 연속 점수
        int sum = 0;          // 총 점수

        for(int i = 0; i < N; i++){
            if(result[i] == 1){
                currentScore++;
                sum += currentScore;
            } else {
                currentScore = 0;
            }
        }
        System.out.println(sum);
    }
}
