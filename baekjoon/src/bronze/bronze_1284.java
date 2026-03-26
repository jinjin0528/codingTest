package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze_1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (str.equals("0")) break;

            char[] input = str.toCharArray();
            int count = input.length+1;
            for(int i = 0; i<input.length;i++){
                if(input[i]=='1') {
                 count += 2;
                }
                else if(input[i]=='0') {
                    count += 4;
                }else{
                    count += 3;
                }
            }
            System.out.println(count);
        }
    }
}
