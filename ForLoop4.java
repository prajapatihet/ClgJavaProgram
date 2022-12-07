import java.util.Scanner;
public class ForLoop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int no = sc.nextInt();
        for(int i=1;i<=no;i++) {
            for(int space=i;space<=no;space++) {
                System.out.print("/");
            }
            for(int j=1;j<=i*2-1;j++) {
                if(j==i||i==no||j==(i*2-1)){
                    System.out.print("^");
                }else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}
