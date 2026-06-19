package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code55 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st =  br.readLine().split(" ");
        int n = st.length;
        int[] num_list= new int[n];
        for(int i=0;i<n;i++){
            num_list[i] = Integer.parseInt(st[i]);
        }
        int odd = 0;
        int even = 0;
        for(int i=0;i<num_list.length;i++){
            if(i % 2==0){
                odd += num_list[i];
            } else {
                even+= num_list[i];
            }
        }
        System.out.println(Math.max(odd, even));
    }
}
