import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
      Scanner in =new Scanner(System.in);
      int num=in.nextInt();
      pali(num);

    }

    private static void pali(int num) {
         int org=num;
        int rev_num=0;
        while(num>0){
             rev_num = rev_num * 10 + num % 10;
             num=num/10;
        }
        if(org==rev_num)
        {
            System.out.println("It's Palindrome "+org);
        }
        else {
            System.out.println("It's not Palindrome "+org);
        }
}}
