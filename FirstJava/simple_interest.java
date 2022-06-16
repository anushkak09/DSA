import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter Principal amt:");
        float principal=in.nextFloat();
        System.out.println("Enter period:");
        float time=in.nextFloat();
        System.out.println("Enter rate:");
        float rate=in.nextFloat();

        float interest=(principal*time*rate)/100;
        System.out.println("Calculate Simple Interest: "+interest);
    }
}

