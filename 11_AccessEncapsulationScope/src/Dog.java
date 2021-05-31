package src;

public class Dog{
    public String name;

    public Dog(String inputName){
        name = inputName;
    }

    public void speakNewName(String name){
        System.out.println("Hello, my new name is " + this.name);
    }

    public static void main(String[] args){
        Dog a = new Dog("Fido");
        Dog b = new Dog("Odie");

        a.speakNewName("Winston");
        // "Fido", the instance variable of Dog a is printed. "Winston" is ignored

        b.speakNewName("Darla");
        // "Odie", the instance variable of Dog b is printed. "Darla" is ignored.
    }
}