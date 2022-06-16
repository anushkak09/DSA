import java.util.Objects;
import java.util.Scanner;

public class number_input {
    public static void main(String[] args) {
        int sum=0;
        Scanner input=new Scanner(System.in);
        String choice= " ";
        while(!choice.equals("x")){
            System.out.println("Enter a  number or x");
            choice=input.next();

            if(!choice.equals("x")){
                int num=Integer.parseInt(choice);
                sum=sum+num;
            }
            
        }
        System.out.println("Sum is: "+sum);
    }
}
