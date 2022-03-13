import java.util.Scanner;

public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int count=1;
        int inv=0;
        while(n>0){
            int mod=n%10;
            inv+=count*(int)(Math.pow(10,mod- 1));
            count++;
            n=n/10;
        }
        System.out.println(inv);
    }
}
