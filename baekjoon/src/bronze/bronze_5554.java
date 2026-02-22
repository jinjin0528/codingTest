package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze_5554 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time =0;
        for(int i=0;i<4;i++){
            time += Integer.parseInt(br.readLine());
        }
        int x = 0;
        int y = 0;
        x= time/60;
        y= time%60;
        System.out.println(x);
        System.out.println(y);
    }
}
