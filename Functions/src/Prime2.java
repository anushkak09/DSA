import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        for(int i=num1;i<num2;i++) {
            if (findPrime(i))
                System.out.println(i + "");
        }
    }

    private static boolean findPrime(int n) {
       if(n==0 ||n==1)
           return false;
       if(n==2)
           return true;
       for(int i=2;i*i<=n;i++) {
           if(n%i==0) //check if it's divisible by smallest number such that 'i*i>n'
           return false;
       }
       return true;
    }
}
