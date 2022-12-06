import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        Revision f = new Revision();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
        int a = 20;
        Integer i = Integer.valueOf(a);
        System.out.println(i);
        Integer j = a;
        System.out.println(j);
    }
}
