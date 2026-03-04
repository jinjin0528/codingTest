package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bronze_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T =  Integer.parseInt(br.readLine());
        int Y = 0;
        int X = 0;
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            if (N % H == 0) {
                Y = H;
                X = N / H;
            } else {
                Y = N % H;
                X = N / H + 1;
            }
            System.out.println(Y*100+X);
        }
    }
}
