import java.util.Scanner;

public class largest_no {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 nos: ");
        int n1= input.nextInt();
        int n2=input.nextInt();
        int n3= input.nextInt();
        //METHOD 1
        //int result=n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
        //System.out.println("Largest num:"+result);

        //METHOD 2
        //int max=n1;
        //if(n2>max) {
        //    max = n2;
        //}
        //if(n3>max){
        //    max=n3;
        //}
        //System.out.println("largest: "+max);

        //METHOD 3
        int max=0 ;
        if(n1>n2){
            max=n1;
        } else{
            max=n2;
        }
        if(n3>max)
        {
            max=n3;
        }
        System.out.println("largest:"+max);
    }
}
