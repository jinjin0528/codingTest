package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class code71 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (n != 1){
            list.add(n);
            if(n%2==0){
                n/=2;
            } else{
                n = 3*n+1;
            }
        }
        list.add(1);
        System.out.println(list);
    }
}
