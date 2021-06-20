public class Dog {

    // Static variables
    public static String genus = "Canis";

    //Instance variables
    public int age;
    public String name;

    public Dog(int inputAge, String inputName){
        // this.age (instance variable) = inputAge (local variable)
        this.age = inputAge;
        this.name = inputName;
    }

    public static void main(String[] args){
        Dog snoopy = new Dog(3, "Snoopy");
        Dog ringo = new Dog(5, "Ringo");

        System.out.println(Dog.genus); // Prints Canis
        System.out.println(snoopy.genus); // Prints Canis
        System.out.println(ringo.genus); // Prints Canis
    }
}