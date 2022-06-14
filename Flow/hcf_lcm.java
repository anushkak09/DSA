import java.util.Scanner;

public class hcf_lcm {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int gcd=1,i;
        for(i=1;i<=num1 && i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }
        int lcm=(num1*num2)/gcd;
        System.out.println("LCM is: "+lcm+" GCD is: "+gcd);


    }
}
