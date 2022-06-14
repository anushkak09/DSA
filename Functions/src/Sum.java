import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println("The sum is:"+sum(num1,num2));
        System.out.println("The product is:"+product(num1,num2));
    }

    private static int product(int num1, int num2) {
        return num1*num2;
    }

    private static int sum(int num1, int num2) {
        return num1+num2;
    }
}
