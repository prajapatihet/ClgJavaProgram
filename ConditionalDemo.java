public class ConditionalDemo {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        if((value1 == value2) || (value1 != value2)){
            System.out.println("OR");
        }
        if((value1 == value2) && (value1 != value2)) {
            System.out.println("AND");
        }
    }
}