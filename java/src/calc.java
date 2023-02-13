import java.util.Scanner;

public class calc {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            Integer x = 0;
            Integer y = 0;
            System.out.println("Enter first number:");
            x = sc.nextInt();
            System.out.println("Enter second number:");
            y = sc.nextInt();  
            System.out.println("Choose the operation:");
            char sign = sc.next().charAt(0);
            int result = 0;
            switch (sign) {
                case '+':
                    result = x + y;
                    break;
                case '-':
                    result = x - y;
                    break;
                case '/':
                    result = x / y;
                    break;
                case '*':
                    result = x * y;
                    break;
                default:  System.out.printf("Error! Enter correct operator");
                    return;
            }
            System.out.println("The answer is " + result);
        }
    }
}
