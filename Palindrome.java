import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        Scanner in=new Scanner(System.in);
        String word= in.next();
        StringBuilder reverse= new StringBuilder();
        int length=word.length();
        for(int i=(length-1);i>=0;--i)
        {
            reverse.append(word.charAt(i));
        }
        if(word.equalsIgnoreCase(reverse.toString())){
            System.out.println(word+" is Palindrome");
        }
        else {
            System.out.println(word+" is not Palindrome");
        }
    }
}
