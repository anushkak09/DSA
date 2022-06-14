import java.io.IOException;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) throws IOException {
          Scanner in=new Scanner(System.in);
          int sum=0;
          System.out.println("Enter marks out of 100 :");
          int num=in.nextInt();
          calc(num);

}
    private static void calc(int sum) {
        System.out.println("Your Grade is:");
        if(sum>=91 && sum<=100) System.out.println("AA Grade");
        else if(sum>=81 && sum<=90) System.out.println("AB Grade");
        else if(sum>=71 && sum<=80) System.out.println("B+ Grade");
        else if(sum>=61 && sum<=70) System.out.println("B Grade");
        else if(sum>=51 && sum<=60) System.out.println("C Grade");
        else System.out.println("FAIL");
    }
}
