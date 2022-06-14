import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

            System.out.println("Enter the digit:");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            int count=0,result = 0;
            while(num!=0) {
                num = num / 10;
                count++;
                if (num != 0) {
                    int ans = num % 10;
                    num = num / 10;
                    result = (int) Math.pow(ans, count);
                }
            }
                if(num==result){
                    System.out.println("It's an Armstrong Number");
                }
                else{
                    System.out.println("Not an Armstrong number");
                }
            }





    }

