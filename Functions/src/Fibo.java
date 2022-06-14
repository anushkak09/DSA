import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number for generating Fibo series:");
        int num=in.nextInt();
        fibo_num(num);
    }

    private static void fibo_num(int num) {
        int a=0;
        int b=1;
        int count=2;
        int temp;
        System.out.println(a);
        System.out.println(b);
        while(count<num){
            temp=b;
            b=a+b;
            a=temp;
            System.out.println(b);
            count++;
        }


    }
}
