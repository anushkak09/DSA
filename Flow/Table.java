import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int i=1,result;
        while(i<=10){
            result=i*num;
            System.out.println(num+"*"+i+"="+result);
            i++;
        }


    }
}
