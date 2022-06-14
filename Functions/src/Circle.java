import java.util.Scanner;

import static java.lang.Math.PI;

public class Circle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.println("Area:"+String.format("%.2f",area(num)));
        System.out.println("Circumference:"+circum(num));

    }

    private static double area(int num) {
    return (PI*num*num);
    }

    private static double circum(int num) {
        return  (PI*2*num);
    }
}
