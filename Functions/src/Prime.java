import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        boolean ans=checkprime(num);
        System.out.println(ans);
    }

    private static boolean checkprime(int num) {
        if(num<1)
            return false;
        int x=2;
        while(x*x<=num){
            if(num%x==0){
                return false;
            }
            x++;
        }
        return x*x>num;
    }
}
