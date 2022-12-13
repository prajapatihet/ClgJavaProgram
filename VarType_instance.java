public class VarType_instance {
    public int id;
    protected String name;
    private String depart;
    VarType_instance(int x,String y, String z) {
        id = x;
        name = y;
        depart = z;
    }
    void display() {
        System.out.println("id = "+id);
        System.out.println("Name = "+name);
        System.out.println("Department = "+depart);
    }
}
