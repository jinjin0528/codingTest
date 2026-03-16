package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bronze_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int result = 0;
        int yaksu =0;
        for(int i=1;i<=N;i++){
            if(N%i==0){
                yaksu++;
            }
            if(yaksu == K){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
