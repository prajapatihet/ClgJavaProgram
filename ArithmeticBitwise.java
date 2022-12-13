import java.util.Scanner;

public class ArithmeticBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int a = sc.nextInt();
        System.out.println("Enter number2: ");
        int b = sc.nextInt();
        System.out.println("Addition is "+ (a+b));
        System.out.println("Subtraction is "+ (a-b));
        System.out.println("Multiplication is "+ (a*b));
        System.out.println("Division is "+ (a/b));
        System.out.println("Modulo is "+ (a%b));
        System.out.println("Bitwise OR is "+ (a|b));
        System.out.println("Bitwise AND is "+ (a&b));
        System.out.println("Bitwise XOR is "+ (a^b));
        System.out.println("Value of a is "+a);
        System.out.println("Bitwise NOT of a is "+ ~a);
    }
}
