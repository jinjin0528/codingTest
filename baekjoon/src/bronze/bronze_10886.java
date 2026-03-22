package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze_10886 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int not_cute = 0;
        int cute = 0;
        for(int i=0;i<N;i++){
            int c = Integer.parseInt(br.readLine());
            if(c==1){
                cute+=1;
            }else {
                not_cute+=1;
            }
        }
        if(not_cute>cute){
            System.out.println("Junhee is not cute!");
        }else{
            System.out.println("Junhee is cute!");
        }
    }
}
