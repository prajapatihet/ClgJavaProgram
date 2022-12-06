import java.util.Scanner;

public class ForLoop3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int no = sc.nextInt();
        for(int i=1;i<=no;i++) {
            for(int space=i;space<=i;space++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}