package src;

import java.util.ArrayList;

public class AccessingIndex {

    /*
    An array is fixed size data structure where the size has to be declared during initialization.
    The ArrayList offers to remove this sizing limitation.
     */

    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<String>();


        myList.add("Mario");
        myList.add("Luigi");

        myList.set(0, "Daisy");
        System.out.println(myList.get(0));
//      System.out.println(myList.get(Integer.parseInt(args[0])));

        System.out.println(myList.toString());



        if (myList.get(0) == "Daisy") {
            System.out.println("It daisy");
        } else {
            System.out.println("it not daisy");
        }



    }
}
