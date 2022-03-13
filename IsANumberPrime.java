import java.util.Scanner;

public class IsANumberPrime {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++) {
            int n = sc.nextInt();
            int count = 0;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 1) {
                System.out.println("not prime");
            } else {
                System.out.println("prime");
            }
        }
    }
}
