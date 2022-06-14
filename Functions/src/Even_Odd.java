import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        check_even_odd(num);
    }

    private static void check_even_odd(int num) {
    if(num==0)
        System.out.println("Whole number");
    if(num%2==0){
        System.out.println("Even no."+num);
    }
    else {
        System.out.println("Odd no."+num);
    }
    }
}

