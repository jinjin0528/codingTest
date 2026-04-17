package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int slice = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(slice * i >= n){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
