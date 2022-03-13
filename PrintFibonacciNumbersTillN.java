import java.util.Scanner;

public class PrintFibonacciNumbersTillN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c;
            for (int i=0;i<n;i++){
                if(i==0) {
                    System.out.println(a);
                }
                else if(i==1){
                    System.out.println(b);
                }
                else {
                    c = a + b;
                    System.out.println(c);
                    a = b;
                    b = c;
                }
            }

    }
}
