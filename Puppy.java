public class Puppy {
    int puppyAge;
    String name;
    public Puppy(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.puppyAge = age;
    }
    public int getAge(){
        System.out.println("Puppy age is "+puppyAge);
        return puppyAge;
    }
    public static void main(String[] args){
        Puppy puppy = new Puppy("Tommy");
        puppy.setAge(5);
        int age = puppy.getAge();
        System.out.println(age);
        System.out.println("Variable value: "+puppy.puppyAge);
    }
}
