import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("id = ");
        int id = sc.nextInt();
        System.out.print("name = ");
        String name = sc.next();
        System.out.print("depart = ");
        String depart = sc.next();
        System.out.print("city = ");
        String city = sc.next();
        details(id,name,depart,city);
    }
    public static void details(int id,String name,String depart,String city) {
        System.out.println("ID = "+id);
        System.out.println("Name = "+name);
        System.out.println("Department = "+depart);
        System.out.println("City = "+city);
    }
}
