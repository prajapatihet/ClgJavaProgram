public class InstanceMethod {
    int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        InstanceMethod instanceMethod = new InstanceMethod();
        int result = instanceMethod.sum(10,20);
        System.out.println(result);
    }
}
