import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the nth number in Fibo Series :");
        int no=in.nextInt();
        int a=0;
        int b=1;
        int count=2;
        System.out.println(a);
        System.out.println(b);
        while(count<no){
            int temp=b;
            b=a+b;
            a=temp;
            System.out.println(a);
            count++;

        }
        //System.out.println("The number is: "+b);
    }
}
