public class BitwiseObject {
    public int a;
    public int b;
    BitwiseObject(int x, int y){
        a=x;
        b=y;
    }
    void display(){
        System.out.println("Value of a is "+a);
    }
    void bitOR() {
        System.out.println("Bitwise OR is "+ (a|b));
    }
    void bitAND() {
        System.out.println("Bitwise AND is "+ (a&b));
    }
    void bitXOR() {
        System.out.println("Bitwise XOR is "+ (a^b));
    }
    void bitNOT() {
        System.out.println("Bitwise NOT of a is "+ ~a);
    }

}
