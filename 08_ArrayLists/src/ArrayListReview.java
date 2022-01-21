package src;

import java.util.ArrayList;

public class ArrayListReview {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Mario");
        myList.add("Luigi");
        myList.add("Peach");
        myList.add("Toad");
        myList.add("Daisy");
        System.out.println("My list is " + myList.size() + "long.");
        System.out.println("The value at index 3 is " + myList.get(3));
        myList.set(1, "Yoshi");
        System.out.println("The value at index 1 is " + myList.get(1));
        myList.remove("Daisy");
        System.out.println("The index of Toad is " + myList.indexOf("Toad"));
    }
}
