package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bronze_2765 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int trip = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double  a = Double.parseDouble(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            double s = Double.parseDouble(st.nextToken());
            if(b==0) break;

            double circumference = a * 3.1415927;           // 둘레(inch)
            double distanceInch = circumference * b;        // 총 거리(inch)
            double distanceMile = distanceInch / 12 / 5280; // 총 거리(mile)
            double hour = s / 3600;                         // 시간(hour)
            double mph = distanceMile / hour;               // 평균 속도

            System.out.printf("Trip #%d: %.2f %.2f%n", trip++, distanceMile, mph);
        }
    }
}
