import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no = sc.nextInt();
        for(int i=1;i<=no;i++) {
            for(int j=1;j<=i;j++) {
                if((j==1)||(i==j)||(i==no)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
