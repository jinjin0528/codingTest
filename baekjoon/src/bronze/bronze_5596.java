package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bronze_5596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = 0;
        int man = 0;
        for(int i=0;i<4;i++){
            min += Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++){
            man += Integer.parseInt(st.nextToken());
        }
        if(min==man) {
            System.out.println(min);
        }else {
            System.out.println(Math.max(man, min));
        }
    }
}
