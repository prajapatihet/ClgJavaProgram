public class ArithmeticObject {
    public int a;
    public int b;
    ArithmeticObject(int x, int y){
        a = x;
        b = y;
    }
    void addition() {
        System.out.println("Addition is "+ (a+b));
    }
    void sub() {
        System.out.println("Subtraction is "+ (a-b));
    }
    void multi(){
        System.out.println("Multiplication is "+ (a*b));
    }
    void division() {
        System.out.println("Division is "+ (a/b));
    }
    void modulo() {
        System.out.println("Modulo is "+ (a%b));
    }
}
