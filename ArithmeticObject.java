public class ArithmeticObject {
    public int a;
    public int b;
    ArithmeticObject(int x, int y){
        a = x;
        b = y;
    }
    void display() {
        System.out.println("Addition is "+ (a+b));
        System.out.println("Subtraction is "+ (a-b));
        System.out.println("Multiplication is "+ (a*b));
        System.out.println("Division is "+ (a/b));
        System.out.println("Modulo is "+ (a%b));
    }
}
