import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= in.nextInt();
        checkArmstrong(num);

    }

    private static void checkArmstrong(int num) {
        int org=num;
        double sum=0;
        while(num!=0)
        {
            int rem=num%10;
            num=num/10;
            sum = sum + Math.pow(rem, count(org));
        }
          if (sum==org){
              System.out.println("Armstrong number");
          }
          else{
              System.out.println("Not Armstrong number");
          }

    }
     static int count(int n){
         int count=0;
         while(n!=0){
            n=n/10;
            count++;
        }
        return count;
     }
}
