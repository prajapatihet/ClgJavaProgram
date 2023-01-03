public class StaticMethod {
    static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        int result = StaticMethod.sum(10,20);
        System.out.println(result);
    }
}
