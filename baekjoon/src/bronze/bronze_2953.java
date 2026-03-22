package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bronze_2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Max = Integer.MIN_VALUE;
        int Max_num = 0;
        for(int i=1;i<=5;i++){
            int sum=0;
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<4;j++){
                int a = Integer.parseInt(st.nextToken());
                sum+=a;
            }
            if(sum>Max){
                Max = sum;
                Max_num = i;
            }
        }
        System.out.println(Max_num+" "+Max);
    }
}
