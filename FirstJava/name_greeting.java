import java.util.Scanner;

public class name_greeting {
    public static void main(String[] args) {
        System.out.println("Enter a name as an input:");
        Scanner in=new Scanner(System.in);
        String name= in.next();
        System.out.println("Hello,"+name+" this is a welcome message");
    }
}
