package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code24 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = str.length;
        int[] num_list = new int[n];
        for(int i=0;i<n;i++){
            num_list[i] = Integer.parseInt(str[i]);
        }
        int answer = 0;
        for(int j=0;j<num_list.length;j++){
            if(num_list[j]<0){
                answer = j;
                break;
            }else {
                answer = -1;
            }
        }
        System.out.println(answer);

    }
}
