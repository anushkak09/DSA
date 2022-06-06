import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        if(num%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

    }
}
