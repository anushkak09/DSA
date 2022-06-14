import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Find the factorial of no.:");
        int num=in.nextInt();
        int ans=fact(num);
        System.out.println("Factorial is:"+ans);

    }
    private static int fact(int num) {
        int fact=1;
          for(int i=1;i<=num;i++){
              fact=fact*i; ///imp
          }
          return fact;

    }
}
