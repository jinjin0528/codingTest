package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bronze_2783 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x =  Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        double ygram = 1000.0/y;
        int n = Integer.parseInt(br.readLine());
        double gram = x*ygram;
        double min = gram;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int xi = Integer.parseInt(st.nextToken());
            int yi = Integer.parseInt(st.nextToken());
            double yigram = 1000.0/yi;
            double igram = xi * yigram;
            if(min > igram){
                min = igram;
            }
        }
        System.out.printf("%.2f", min);
    }
}
