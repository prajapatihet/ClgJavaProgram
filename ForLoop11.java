import java.util.Scanner;

public class ForLoop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i+1;j++)
            {
                if(i==1 || j==1 || i+j==11) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
