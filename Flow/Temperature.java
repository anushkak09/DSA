import java.sql.SQLOutput;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float tempC=input.nextFloat();
        System.out.println("Enter temperature"+tempC);
        float tempF=(tempC * 9/5)+32;
        System.out.println("Temperature in Farhaenite...."+tempF);

    }
}
