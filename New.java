import java.util.Arrays;
import java.util.Scanner;

class New {
    public static void main(String[] args) {
//        java.util.Scanner sc = new java.util.Scanner(System.in);
        double[][] a = new double[3][2];
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
        System.out.println(a[0]);
        System.out.println(a[0].length);
        System.out.println();

        int[][] b = new int[3][];
        b[0] = new int[3];
        b[1] = new int[3];
        b[2] = new int[3];
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[0].length);
        System.out.println(b[1].length);
        System.out.println(b[2].length);
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        boolean c[][] = new boolean[3][3];
        System.out.println(c);
        System.out.println(c.length);
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(c[0].length);
        System.out.println(c[1].length);
        System.out.println(c[2].length);
    }
}