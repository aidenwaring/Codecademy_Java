package src;

import java.util.ArrayList;

public class AddSetRemove {
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<String>();


        myList.add("Mario");
        myList.add("Luigi");
        myList.add("Yoshi");

        // Can be removed by specifying ArrayList value. Note, removes first instance of value
        myList.remove("Mario");

        // Can also be removed by specifying ArrayList index
        myList.remove(0);

        System.out.println(myList.toString());
    }
}
