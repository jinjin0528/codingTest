package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bronze_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int m = 60;
        if(M<45){
            M += 60-45;
            if(H==0){
                H = 23;
            }else{
                H -= 1;
            }
        }else{
            M= M-45;
        }
        System.out.println(H+" "+M);
    }
}
