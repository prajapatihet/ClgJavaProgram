public class ArrayExample {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        arr[0][1] = arr[0][1];
        arr[0][0] = arr[1][1];
        arr[1][1] = 7;
        for(int i=0;i< arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
