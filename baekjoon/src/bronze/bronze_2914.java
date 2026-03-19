package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bronze_2914 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int I = Integer.parseInt(st.nextToken());
        int melody = 0;
        if(I==100){
            System.out.println(100);
        }else {
            melody = A * (I-1) +1;
            System.out.println(melody);
        }
    }
}
