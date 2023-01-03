public class ParameterizedConstructor {
    public static void main(String[] args){
        PC pc = new PC("HET",20);
        System.out.println("Name is "+pc.name+" and Age is "+pc.age);
    }
}
class PC{
    String name;
    int age;
    PC(String name,int age){
        this.name = name;
        this.age = age;
    }
}
