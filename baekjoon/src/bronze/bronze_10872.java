package bronze;

import java.util.Scanner;

public class bronze_10872 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N<= 1){
            System.out.print(1);
        } else{
            int fac = 1;
            for (int i = 2; i<=N; i++){
                fac*=i;
            }
            System.out.print(fac);
        }
    }
}
