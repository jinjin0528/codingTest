package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze_3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double R = Double.parseDouble(br.readLine());
        double circle = (R*R)*Math.PI;
        double taxi = 2*(R*R);
        System.out.println(circle);
        System.out.println(taxi);
    }
}
