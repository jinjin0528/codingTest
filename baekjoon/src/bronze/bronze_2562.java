package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int max_index = 0;
        for(int i=1;i<=9;i++){
            int n = Integer.parseInt(br.readLine());
            if(n>max){
                max = n;
                max_index = i;
            }
        }
        System.out.println(max);
        System.out.println(max_index);
    }
}
