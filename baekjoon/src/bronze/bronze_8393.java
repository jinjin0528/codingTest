package bronze;
import java.util.Scanner;

public class bronze_8393 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i= 1; i<=n; i++){
            sum = n+i;
        }
        System.out.println(sum);
    }
}
