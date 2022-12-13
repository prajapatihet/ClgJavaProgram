import java.util.Scanner;

public class ArithmeticBitwiseObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int a = sc.nextInt();
        System.out.println("Enter number2: ");
        int b = sc.nextInt();
        ArithmeticObject arithmeticObject = new ArithmeticObject(a,b);
        System.out.println("Arithmetic Operations");
        arithmeticObject.display();
        BitwiseObject bitwiseObject = new BitwiseObject(a,b);
        System.out.println("Bitwise Operation");
        bitwiseObject.display();
    }
}
