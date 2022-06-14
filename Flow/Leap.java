import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        System.out.println("Enter a year of ur choice: ");
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();

        if(year%4==0){
            System.out.println("It's a leap year");
        }
        else{
            System.out.println("It's not leap year");
        }
    }
}
