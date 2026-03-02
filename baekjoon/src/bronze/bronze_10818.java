package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bronze_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int min = Integer.MAX_VALUE;    // 가장 큰 수로 지정
        int max = Integer.MIN_VALUE;    // 가장 작은 수로 지정

        for(int i=0;i<N;i++){
            int x = Integer.parseInt(st.nextToken());
            if (x < min) min = x;   // 지정 값보다 작으면 입력값으로 교체
            if (x > max) max = x;   // 지정 값보다 크면 입력값으로 교체
        }
        System.out.print(min+" "+max);
    }
}
