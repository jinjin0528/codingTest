package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code52 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st =  br.readLine().split(" ");
        int m = st.length;
        int[] numbers = new int[m];
        for(int i=0;i<m;i++){
            numbers[i] = Integer.parseInt(st[i]);
        }
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int num:numbers){
            answer += num;
            if(answer > n) {
                break;
            }
        }
        System.out.println(answer);
    }
}
