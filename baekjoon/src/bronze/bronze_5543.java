package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze_5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int set[] = new int[5];
        for(int i=0;i<5;i++){
            set[i] = Integer.parseInt(br.readLine());
        }
        // 버거 최소 금액
        int burgerMin = Math.min(set[0], Math.min(set[1], set[2]));
        // 음료 콜라 || 사이다 최소 금액
        int drinkMin = Math.min(set[3], set[4]);

        System.out.println(burgerMin + drinkMin - 50);
    }
}
