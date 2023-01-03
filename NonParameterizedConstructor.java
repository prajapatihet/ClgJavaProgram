public class NonParameterizedConstructor {
    public static void main(String[] args){
        NPC npc = new NPC();
        System.out.println(npc.name);
        System.out.println(npc.age);
    }
}
class NPC{
    String name;
    int age;
    NPC(){
        System.out.println("Called Constructor");
    }
}
