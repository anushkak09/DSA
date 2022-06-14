import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int age= in.nextInt();
        check_age(age);
    }

    private static void check_age(int age) {
        if(age>18)
            System.out.println("Eligible!");
        else System.out.println("Not Eligible.");
    }
}
