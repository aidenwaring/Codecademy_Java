package src;

public class AidosArrays {

    int age;
    String name;

    public AidosArrays(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public static void main(String[] args){
        AidosArrays nice = new AidosArrays(24, "Aidos");
        System.out.println(nice.getName());
        System.out.println(nice.setName("Wario"));
    }

}
