package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze_2010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int plug = 0;
        for(int i = 0;i<N;i++){
            plug +=  Integer.parseInt(br.readLine());
        }
        plug -= (N-1);
        System.out.println(plug);
    }
}
