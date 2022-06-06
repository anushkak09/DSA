import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1;
        while (true) {
            System.out.println("Enter numbers:");
            n1 = in.nextInt();
            int n2 = in.nextInt();
            System.out.println("Enter the operator");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                if (op == '+') n1 = n1 + n2;
                if (op == '-') n1 = n1 - n2;
                if (op == '*') n1 = n1 * n2;
                if (op == '/') n1 = n1 / n2;
                if (op == '%') n1 = n1 % n2;
            } else if (op == 'x' || op == 'X')
                break;
            else {
                System.out.println("Invalid operation");
            }
            System.out.println("Result:" + n1);
        }

    }
}
