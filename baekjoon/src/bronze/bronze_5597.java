package bronze;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bronze_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int students[] = new int[30];
        for(int i=0;i<28;i++){
            int n = Integer.parseInt(br.readLine());
            students[n-1]=1;
            }
        for(int i=0;i<30;i++){
            if(students[i]==0){
                System.out.println(i+1);
            }
        }
    }
}
