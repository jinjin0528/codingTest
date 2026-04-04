package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bronze_2712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            double m = Double.parseDouble(st.nextToken());
            String n = st.nextToken();
            if(n.equals("kg")){
                System.out.printf("%.4f lb\n", m * 2.2046);
            }else if(n.equals("lb")){
                System.out.printf("%.4f kg\n", m * 0.4536);
            } else if(n.equals("l")){
                System.out.printf("%.4f g\n", m * 0.2642);
            } else if(n.equals("g")){
                System.out.printf("%.4f l\n", m * 3.7854);
            }
        }
    }
}
