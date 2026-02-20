package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bronze_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int total = 0;
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int price = Integer.parseInt(st.nextToken());
            int items = Integer.parseInt(st.nextToken());
            total+=price*items;
        }
        if(total==X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
