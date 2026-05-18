package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code27 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st =  br.readLine().split(" ");
        int m = st.length;
        int[] num_list = new int[m];
        for(int i=0;i<m;i++){
            num_list[i] = Integer.parseInt(st[i]);
        }
        int n = Integer.parseInt(br.readLine());
        int[] answer = new int[num_list.length -n+1];
        for(int i=n-1; i< num_list.length;i++){
            answer[i-(n-1)] = num_list[i];
        }
        System.out.println(Arrays.toString(answer));
    }
}
