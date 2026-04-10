package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze_2857 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean found = false;
        for(int i =1; i<=5;i++){
            String code = br.readLine();
            if(code.contains("FBI")){
                sb.append(i).append(" ");
                found = true;
            }
        }
        if(!found) {
            System.out.println("HE GOT AWAY!");
        }else {
            System.out.println(sb.toString().trim());
        }
    }
}
