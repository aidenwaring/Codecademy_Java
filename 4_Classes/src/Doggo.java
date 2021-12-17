public class Doggo {
    String breed;
    boolean hasOwner;
    int age;

    public Doggo(String DoggoBreed, boolean DoggoOwned, int DoggoYears) {
      System.out.println("Constructor invoked!");
      breed = DoggoBreed;
      hasOwner = DoggoOwned;
      age = DoggoYears;
    }
    
    public static void main(String[] args) {
      System.out.println("Main method started");
      Doggo fido = new Doggo("poodle", false, 4);
      Doggo nunzio = new Doggo("shiba inu", true, 12);
      boolean isFidoOlder = fido.age > nunzio.age;
      int totalDoggoYears = nunzio.age + fido.age;
      System.out.println("Two Doggos created: a " + fido.breed + " and a " + nunzio.breed);
      System.out.println("The statement that fido is an older Doggo is: " + isFidoOlder);
      System.out.println("The total age of the Doggos is: " + totalDoggoYears);
      System.out.println("Main method finished");
    }
  }