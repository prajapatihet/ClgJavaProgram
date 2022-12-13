public class BitwiseObject {
    public int a;
    public int b;
    BitwiseObject(int x, int y){
        a=x;
        b=y;
    }
    void display(){
        System.out.println("Bitwise OR is "+ (a|b));
        System.out.println("Bitwise AND is "+ (a&b));
        System.out.println("Bitwise XOR is "+ (a^b));
        System.out.println("Value of a is "+a);
        System.out.println("Bitwise NOT of a is "+ ~a);
    }
}
