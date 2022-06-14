import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();
        max(num1,num2,num3);
        min(num1,num2,num3);
    }

    private static void min(int num1, int num2, int num3) {
        int ans=num1<num2?(num1<num3?num1:num3):(num2<num3?num2:num3);
        System.out.println("Minimum number is:"+ans);
    }

    private static void max(int num1, int num2, int num3) {
        int max=num1;
        if(num2>max)
            max=num2;
        if(num3>max)
            max=num3;
        System.out.println("Maximum number is:"+max);
    }
}
