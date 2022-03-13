import java.util.Scanner;

public class PrintAllPrimesTillN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        for(int i=low;i<=high;i++){
            int count=0;
            if (low==1){
                count=0;
            }else {
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
            }
            if (count==0){
                System.out.println("prime"+i);
            }else {
                System.out.println("not prime"+i);
            }
        }
    }
}