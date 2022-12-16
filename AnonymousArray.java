public class AnonymousArray {
    public static void main(String[] args) {
        System.out.println("Sum of array elements is: "+sumArrayElements(new int[]{20,10,40,30}));
    }

    private static int sumArrayElements(int[] arr) {
        int sum = 0;
        for(int a:arr){
            sum += a;
        }
        return sum;
    }
}
