import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        while(true){
        System.out.println("Press R for RUP and D for USD:");
        Scanner in=new Scanner(System.in);
       char ch=in.next().trim().charAt(0);
        if (ch == 'R') {
            System.out.println("Enter amount in rupees:");
            float amt=in.nextFloat();
            NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(amt);
            float rupee_to_usd=amt/78;
            System.out.println("Amt in USD:$"+rupee_to_usd);
        }else if(ch=='D') {
            System.out.println("Enter the amount in Dollars:");
            float amt2=in.nextFloat();
            float usd_to_rupee=amt2*78;
            NumberFormat.getCurrencyInstance(new Locale("en","USA")).format(usd_to_rupee);
            System.out.println("Amt in Rupees:"+usd_to_rupee);
        }else {
            System.out.println("Invalid character");
            break;
        }


    }}
}
