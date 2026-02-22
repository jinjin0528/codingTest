package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze_1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = br.readLine().toUpperCase();
            if(s.equals("#")) break;
            char[] c = s.toCharArray();
            int count = 0;
            for(int i=0;i<c.length;i++){
                if(c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
