package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code75 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] date1 = new int[3];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < 3; i++) {
            date1[i] = Integer.parseInt(input[i]);
        }

        int[] date2 = new int[3];
        input = br.readLine().split(" ");
        for (int i = 0; i < 3; i++) {
            date2[i] = Integer.parseInt(input[i]);
        }

        for(int i=0;i<3;i++){
            if(date1[i] < date2[i]){
                System.out.println(1);
                return;
            } else if(date1[i] > date2[i]){
                System.out.println(0);
                return;
            }
        }
        System.out.println(0);
    }
}
