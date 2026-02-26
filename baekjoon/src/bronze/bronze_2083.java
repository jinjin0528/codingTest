package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bronze_2083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weigh = Integer.parseInt(st.nextToken());
            if(name.equals("#")) break;
            if(age > 17 || weigh >= 80){
                System.out.println(name + " Senior");
            }else{
                System.out.println(name + " Junior");
            }
        }
    }
}
